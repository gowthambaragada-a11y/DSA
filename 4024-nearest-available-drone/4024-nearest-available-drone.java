class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int sd=Integer.MAX_VALUE,ans=-1;
        for(int i=0;i<drones.length;i++){
            if(Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1])<=drones[i][2]){
                if(sd>Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1])){
                    sd=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
                    ans=i;
                }
            }
        }
        return ans;
    }
}