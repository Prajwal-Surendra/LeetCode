class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=i;j<matrix.length;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++) {
            reverse(matrix[i],0,matrix[i].length-1);
        }
    }
    public void reverse(int[] arr, int i, int j) {
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}