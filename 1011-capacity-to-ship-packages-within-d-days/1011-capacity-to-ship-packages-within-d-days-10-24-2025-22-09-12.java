class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int sum=0,max=0;

        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }

        int low=max,high=sum,ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(mid,weights,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int capacity, int[] arr, int d){
        int sum=0,daycount=1;
        for(int i=0;i<arr.length;i++){
            

            if(sum+arr[i]<=capacity){
                sum+=arr[i];
            }else{
                daycount++;
                sum=arr[i];
            }
        }

        return (daycount<=d);
    }
}