class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int n=nums.length;
        int i=0;
        while(q.size()<k){
            q.add(nums[i++]);
            System.out.println(q.peek());
        }

        for(i=k;i<n;i++){
            if(nums[i]>q.peek()){
                q.poll();
                q.add(nums[i]);
            }
            System.out.println(q.peek());

        }

        return q.poll();

    }
}