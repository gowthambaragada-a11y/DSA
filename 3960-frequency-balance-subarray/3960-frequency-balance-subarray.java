class Solution {
    public int getLength(int[] nums) {
        int n = nums.length;
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        int id = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], id++);
            }
            arr[i] = map.get(nums[i]);
        }

        int maxLen = 0;
        int[] freqs = new int[id];
        int[] freqCounts = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int distinctElements = 0;
            int maxFreq = 0;
            int distinctFreqs = 0;

            for (int j = i; j < n; j++) {
                int val = arr[j];
                int oldFreq = freqs[val];
                int newFreq = oldFreq + 1;
                freqs[val] = newFreq;

                if (oldFreq == 0) {
                    distinctElements++;
                }

                if (oldFreq > 0) {
                    freqCounts[oldFreq]--;
                    if (freqCounts[oldFreq] == 0) {
                        distinctFreqs--;
                    }
                }
                
                if (freqCounts[newFreq] == 0) {
                    distinctFreqs++;
                }
                freqCounts[newFreq]++;

                if (newFreq > maxFreq) {
                    maxFreq = newFreq;
                }

                if (distinctElements == 1) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                    }
                } else if (distinctFreqs == 2 && maxFreq % 2 == 0 && freqCounts[maxFreq / 2] > 0) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                    }
                }
            }
            
            for (int j = i; j < n; j++) {
                int val = arr[j];
                int f = freqs[val];
                if (f > 0) {
                    freqCounts[f] = 0;
                    freqs[val] = 0;
                }
            }
        }
        return maxLen;
    }
}