class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int prod=(matrix.length*matrix[0].length)-1;

        return binarySearch(matrix, 0, prod, target);
    }

    public boolean binarySearch(int[][] matrix, int start, int end, int target){

        if(start>end) return false;
        int mid=start+(end-start)/2;
        int j=mid%matrix[0].length;
        int i=mid/matrix[0].length;

        if(target==matrix[i][j]) return true;

        if(target>matrix[i][j]) return binarySearch(matrix, mid+1, end, target);

        if(target<matrix[i][j]) return binarySearch(matrix, start, mid-1, target);

        return false;
    }
}