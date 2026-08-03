from typing import List
from bisect import bisect_right
from itertools import accumulate
class Solution:
    def countTasks(self, tasks: List[int], shifts: List[int]) -> List[int]:
        pref=[0]+list(accumulate(tasks))
        n=len(tasks)
        ans=[]
        idx,rem=0,tasks[0]
        for t in shifts:
            if t<rem:
                rem-=t
                ans.append(n-idx)
            else:
                t-=rem
                idx+=1
                if idx==n:
                    ans.append(0)
                    idx,rem=0,tasks[0]
                    continue
                target=t+pref[idx]
                pos=bisect_right(pref,target)-1
                if pos>=n:
                    ans.append(0)
                    idx,rem=0,tasks[0]
                else:
                    idx=pos
                    rem=tasks[idx]-(target-pref[idx])
                    ans.append(n-idx)
        return ans