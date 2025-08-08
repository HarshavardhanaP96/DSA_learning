class KthLargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int num:nums){
            if(pq.size()<k) pq.add(num);
            else if(pq.peek()<num){
                pq.add(num);
                pq.poll();
            }

        }
    }
    
    public int add(int val) {

        if(pq.size()<k) pq.add(val);
        else if(pq.peek()<val){
            pq.add(val);
            pq.poll();
        }

        return pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */