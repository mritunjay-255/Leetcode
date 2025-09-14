class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum=0,costsum=0;
        for(int i=0;i<gas.length;i++){
            gassum+=gas[i];
            costsum+=cost[i];
        }
        if(gassum<costsum) return -1;
        int currenttank=0,startindex=0;
        for(int i=0;i<gas.length;i++){
            currenttank+=gas[i]-cost[i];
            if(currenttank<0){
                currenttank = 0;
                startindex=i+1;
            }
        }
        return startindex;
    }
}