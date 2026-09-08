class Solution {

    int minFairness=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        
        Arrays.sort(cookies);
        int[] children =new int[k];


        dfs(cookies, 0, children, k);
        return minFairness;
    
    }


    public void dfs(int[] cookies, int index, int[] children, int k) {

        if(index==cookies.length){
            int max=0;
            for(int child:children){
                max=Math.max(child, max);
            }

            minFairness=Math.min(minFairness,max);
            return;
        }

        for(int i=0;i<k;i++){

            if(children[i]+cookies[index]>=minFairness) continue;

            children[i]+=cookies[index];
            dfs(cookies, index+1, children, k);


            children[i]-=cookies[index];
        }


    }

        
    
}