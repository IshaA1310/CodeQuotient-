class Result {
  static int[] reverseSubarray(int a[], int n, int k) {
    if(k==1){
      return a ;}
    for(int i=0; i<n; i+=k){
      int l = i;
      int r = Math.min(l+k-1, n-1);
   
      while(l<r){
        int temp = a[l];
        a[l] = a[r];
        a[r]=temp;
        l++;
        r--;
        }
  }
    return a;
  }
  
}
