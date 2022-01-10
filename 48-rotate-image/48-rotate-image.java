class Solution {
    public void rotate(int[][] arr) {
        transpose(arr);
        flip(arr);
        return;
    }
    
    public void transpose(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    
    public void flip(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int temp=0;
        for(int i=0;i<m/2;i++){
            for(int j=0;j<n;j++){
                temp=arr[j][i];
                arr[j][i]=arr[j][m-1-i];
                arr[j][m-1-i]=temp;
            }
        }
    }
}