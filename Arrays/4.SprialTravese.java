Spirally traversing matrix


class Result {
  static void printSpiral(int a[][], int r, int c) {
    int top =0;
    int down = r-1;
    int left = 0;
    int right = c-1;
    int dir =1;
    while(top<= down && left<=right){
      if(dir == 1){
        for(int i= left; i<=right; i++){
          System.out.println(a[top][i]);}
          top++;
          dir =2;}
       else if(dir==2){
          for(int i=top; i<=down; i++){
            System.out.println(a[i][right]);}
            right--;
            dir=3;}
      else if(dir==3){
        for(int i=right; i>=left; i--){
          System.out.println(a[down][i]);}
        down--;
        dir=4;}
      else if(dir==4){
        for(int i=down; i>=top; i--){
          System.out.println(a[i][left] );}
        left++;
        dir=1;}
      }
    
  }
}
