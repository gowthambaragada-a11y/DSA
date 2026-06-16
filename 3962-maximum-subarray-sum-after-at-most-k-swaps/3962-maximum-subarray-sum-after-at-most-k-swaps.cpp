class Solution {
    int V;
    int bit_c_in[2055], bit_c_out[2055], bit_c_full[2055];
    long long bit_s_in[2055], bit_s_out[2055], bit_s_full[2055];

    inline void add(int* bit_c, long long* bit_s, int idx, int val, int sign) {
        for (; idx <= V; idx += idx & -idx) {
            bit_c[idx] += sign;
            bit_s[idx] += sign * val;
        }
    }

    inline long long query_s(long long* bit_s, int idx) {
        long long sum = 0;
        for (; idx > 0; idx -= idx & -idx) {
            sum += bit_s[idx];
        }
        return sum;
    }

    inline int query_c(int* bit_c, int idx) {
        int sum = 0;
        for (; idx > 0; idx -= idx & -idx) {
            sum += bit_c[idx];
        }
        return sum;
    }

    inline int get_kth_smallest(int* bit, int k) {
        int idx = 0;
        for (int i = 10; i >= 0; i--) {
            int next_idx = idx | (1 << i);
            if (next_idx <= V && bit[next_idx] < k) {
                idx = next_idx;
                k -= bit[idx];
            }
        }
        return idx + 1;
    }

    inline long long sum_kth_smallest(int* bit_c, long long* bit_s, int k, const vector<int>& uncomp) {
        if (k <= 0) return 0;
        int r = get_kth_smallest(bit_c, k);
        long long c = query_c(bit_c, r - 1);
        long long s = query_s(bit_s, r - 1);
        return s + (long long)(k - c) * uncomp[r];
    }

    inline long long sum_kth_largest(int* bit_c, long long* bit_s, int tot, int k, const vector<int>& uncomp) {
        if (k <= 0) return 0;
        long long total_sum = query_s(bit_s, V);
        return total_sum - sum_kth_smallest(bit_c, bit_s, tot - k, uncomp);
    }

public:
    long long maxSum(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> uncomp = nums;
        sort(uncomp.begin(), uncomp.end());
        uncomp.erase(unique(uncomp.begin(), uncomp.end()), uncomp.end());
        V = uncomp.size();
        uncomp.insert(uncomp.begin(), 0);

        vector<int> rank(n);
        for (int i = 0; i < n; i++) {
            rank[i] = lower_bound(uncomp.begin() + 1, uncomp.end(), nums[i]) - uncomp.begin();
        }

        memset(bit_c_full, 0, sizeof(bit_c_full));
        memset(bit_s_full, 0, sizeof(bit_s_full));
        for (int i = 0; i < n; i++) {
            add(bit_c_full, bit_s_full, rank[i], nums[i], 1);
        }

        long long max_ans = -2e18;

        for (int i = 0; i < n; i++) {
            memcpy(bit_c_out, bit_c_full, sizeof(int) * (V + 1));
            memcpy(bit_s_out, bit_s_full, sizeof(long long) * (V + 1));
            memset(bit_c_in, 0, sizeof(int) * (V + 1));
            memset(bit_s_in, 0, sizeof(long long) * (V + 1));

            long long current_sum = 0;
            int tot_in = 0;
            int tot_out = n;

            for (int j = i; j < n; j++) {
                int r = rank[j];
                int val = nums[j];

                add(bit_c_out, bit_s_out, r, val, -1);
                add(bit_c_in, bit_s_in, r, val, 1);

                current_sum += val;
                tot_in++;
                tot_out--;

                int low = 0, high = min({k, tot_in, tot_out});
                int ans_x = 0;
                
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (mid == 0) {
                        ans_x = max(ans_x, 0);
                        low = mid + 1;
                        continue;
                    }
                    
                    int val_in = uncomp[get_kth_smallest(bit_c_in, mid)];
                    int val_out = uncomp[get_kth_smallest(bit_c_out, tot_out - mid + 1)];
                    
                    if (val_in < val_out) {
                        ans_x = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                long long gain = 0;
                if (ans_x > 0) {
                    gain = sum_kth_largest(bit_c_out, bit_s_out, tot_out, ans_x, uncomp) -
                           sum_kth_smallest(bit_c_in, bit_s_in, ans_x, uncomp);
                }
                
                if (current_sum + gain > max_ans) {
                    max_ans = current_sum + gain;
                }
            }
        }

        return max_ans;
    }
};