import java.util.*;

public class Solution {
    public int[] numberOfPairs(int[] nums1, int[] nums2, int[][] queries) {
        int n2 = nums2.length;
        int blockSize = (int) Math.sqrt(n2) + 1;
        int numBlocks = (n2 + blockSize - 1) / blockSize;

        int[] blockLazy = new int[numBlocks];
        Map<Integer, Integer>[] blockFreq = new HashMap[numBlocks];
        for (int i = 0; i < numBlocks; i++) {
            blockFreq[i] = new HashMap<>();
        }

        for (int i = 0; i < n2; i++) {
            int bId = i / blockSize;
            blockFreq[bId].put(nums2[i], blockFreq[bId].getOrDefault(nums2[i], 0) + 1);
        }

        Map<Integer, Integer> nums1Freq = new HashMap<>();
        for (int x : nums1) {
            nums1Freq.put(x, nums1Freq.getOrDefault(x, 0) + 1);
        }

        List<Integer> ansList = new ArrayList<>();

        for (int[] q : queries) {
            if (q[0] == 1) {
                int x = q[1];
                int y = q[2];
                int val = q[3];

                int startBlock = x / blockSize;
                int endBlock = y / blockSize;

                if (startBlock == endBlock) {
                    for (int i = x; i <= y; i++) {
                        int bId = startBlock;
                        int oldVal = nums2[i];
                        
                        blockFreq[bId].put(oldVal, blockFreq[bId].get(oldVal) - 1);
                        if (blockFreq[bId].get(oldVal) == 0) {
                            blockFreq[bId].remove(oldVal);
                        }
                        
                        nums2[i] += val;
                        blockFreq[bId].put(nums2[i], blockFreq[bId].getOrDefault(nums2[i], 0) + 1);
                    }
                } else {
                    int endOfFirstBlock = (startBlock + 1) * blockSize - 1;
                    for (int i = x; i <= endOfFirstBlock; i++) {
                        int bId = startBlock;
                        int oldVal = nums2[i];
                        blockFreq[bId].put(oldVal, blockFreq[bId].get(oldVal) - 1);
                        if (blockFreq[bId].get(oldVal) == 0) {
                            blockFreq[bId].remove(oldVal);
                        }
                        nums2[i] += val;
                        blockFreq[bId].put(nums2[i], blockFreq[bId].getOrDefault(nums2[i], 0) + 1);
                    }

                    for (int bId = startBlock + 1; bId < endBlock; bId++) {
                        blockLazy[bId] += val;
                    }

                    int startOfLastBlock = endBlock * blockSize;
                    for (int i = startOfLastBlock; i <= y; i++) {
                        int bId = endBlock;
                        int oldVal = nums2[i];
                        blockFreq[bId].put(oldVal, blockFreq[bId].get(oldVal) - 1);
                        if (blockFreq[bId].get(oldVal) == 0) {
                            blockFreq[bId].remove(oldVal);
                        }
                        nums2[i] += val;
                        blockFreq[bId].put(nums2[i], blockFreq[bId].getOrDefault(nums2[i], 0) + 1);
                    }
                }
            } else if (q[0] == 2) {
                int tot = q[1];
                int totalPairs = 0;

                for (Map.Entry<Integer, Integer> entry : nums1Freq.entrySet()) {
                    int n1Val = entry.getKey();
                    int n1Count = entry.getValue();
                    int targetN2 = tot - n1Val;

                    int n2Count = 0;
                    for (int bId = 0; bId < numBlocks; bId++) {
                        int trueTarget = targetN2 - blockLazy[bId];
                        n2Count += blockFreq[bId].getOrDefault(trueTarget, 0);
                    }

                    totalPairs += n1Count * n2Count;
                }
                ansList.add(totalPairs);
            }
        }

        int[] result = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            result[i] = ansList.get(i);
        }
        return result;
    }
}