class Solution(object):
    def maxRatings(self, units):
        if len(units) == 1:
            return min(units[0])
        
        s0 = float('inf')
        sum_m = 0
        min_m = float('inf')
        
        for u in units:
            if len(u) == 1:
                min1 = u[0]
                min2 = 0
            else:
                min1 = min(u)
                u.remove(min1)
                min2 = min(u)
            
            if min1 < s0:
                s0 = min1
            
            m = min1 if min1 > min2 else min2
            sum_m += m
            
            if m < min_m:
                min_m = m
                
        return sum_m - min_m + s0