class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0,tcost=0;
        for(int i=0;i<gas.length;i++){
            tgas=tgas+gas[i];
            tcost=tcost+cost[i];

        }
        if(tgas<tcost)
          return -1;
           int st=0,fl=0;
           for(int i=0;i<cost.length;i++){
            fl+=gas[i]-cost[i];
            if(fl<0){
                st=i+1;
                fl=0;
            }
           }
           return st;
    }
}