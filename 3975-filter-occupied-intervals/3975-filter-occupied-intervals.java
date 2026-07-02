import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int start = occupiedIntervals[0][0];
        int end = occupiedIntervals[0][1];
        
        for (int i = 1; i < occupiedIntervals.length; i++) {
            if (occupiedIntervals[i][0] <= end + 1) {
                end = Math.max(end, occupiedIntervals[i][1]);
            } else {
                merged.add(new int[]{start, end});
                start = occupiedIntervals[i][0];
                end = occupiedIntervals[i][1];
            }
        }
        merged.add(new int[]{start, end});
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (int[] interval : merged) {
            int s = interval[0];
            int e = interval[1];
            
            if (e < freeStart || s > freeEnd) {
                result.add(Arrays.asList(s, e));
            } else {
                if (s < freeStart) {
                    result.add(Arrays.asList(s, freeStart - 1));
                }
                if (e > freeEnd) {
                    result.add(Arrays.asList(freeEnd + 1, e));
                }
            }
        }
        
        return result;
    }
}