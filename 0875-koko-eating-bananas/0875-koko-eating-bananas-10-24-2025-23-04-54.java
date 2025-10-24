class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=1000000000,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] arr, int mid, int hMax ){
        long hoursRequired=0;
        for (int i = 0; i < arr.length; i++) {
            hoursRequired += (long) Math.ceil((arr[i] * 1.0) / mid);
        }


        return (hoursRequired<=hMax);

    }
}