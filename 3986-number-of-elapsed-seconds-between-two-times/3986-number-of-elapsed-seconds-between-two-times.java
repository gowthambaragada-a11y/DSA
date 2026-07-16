class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return s(endTime.split(":"))-s(startTime.split(":"));
    }
    int s(String []str){
        int c=0;
        c+=Integer.parseInt(str[0])*60*60;
        c+=Integer.parseInt(str[1])*60;
        c+=Integer.parseInt(str[2]);
        return c;
    }
}