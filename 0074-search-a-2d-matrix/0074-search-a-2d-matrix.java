class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
        int n= arr.length;
        int m = arr[0].length;
        
          int l=0;
            int r=n*m-1;
            
            while(l<=r){
                int mid =l+(r-l)/2;
                if(arr[mid/m][mid%m]==target){
                    return true;
                }
                else if(arr[mid/m][mid%m]>target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return false;
    }
}