//counter diagonal
class Result {
  static void counterDiagonal(int mat[][], int n) {
    for(int col=0; col<n; col++){
      int i=0, j=col;
      while(i<n&&j>=0){
        System.out.print(mat[i][j]+" ");
        i++;
        j--;}
      }
      for(int row=1; row<=n-1; row++){
        int i=row;
        int j=n-1;
        while(i<n && j>=0){
          System.out.print(mat[i][j]+" ");
          i++;
          j--;}}
  }
}
