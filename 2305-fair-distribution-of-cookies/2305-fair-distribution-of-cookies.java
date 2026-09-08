class Solution {

    int minFairness=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        
        Arrays.sort(cookies);
        reverse(cookies);
        int[] children =new int[k];


        dfs(cookies, 0, children, 0);
        return minFairness;
    
    }


    public void dfs(int[] cookies, int index, int[] children, int currentMax) {

        if(currentMax>=minFairness) return;

        if(index==cookies.length){

            minFairness=currentMax;
            return;
        }

        for(int i=0;i<children.length;i++){

            if(children[i]+cookies[index]>=minFairness) continue;


            children[i]+=cookies[index];
            dfs(cookies, index+1, children, Math.max(currentMax,children[i]));


            children[i]-=cookies[index];


            if (children[i] == 0) {
                break;
            }
        }


    }

    public void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
    
        }
    }

        
    
}