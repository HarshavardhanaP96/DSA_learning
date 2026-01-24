class Solution {
    public void moveZeroes(int[] arr) {
        int head=0;
        int tail=0;

        while(head<arr.length){
            if(arr[head]!=0){
                swap(arr, head, tail);
                tail++;
            }
            head++;
        }
    }

    public void swap(int[]arr,int head, int tail){
        int temp=arr[head];
        arr[head]=arr[tail];
        arr[tail]=temp;
    }
}