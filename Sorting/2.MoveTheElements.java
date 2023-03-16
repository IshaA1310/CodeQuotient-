//Move elements

class Result {
  static void moveElements(int arr[]) {
    int size = arr.length;
    int a[] = new int[size];
    int j=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]>=0){
        a[j]=arr[i];
        j++;}}
    for( int i=0; i<arr.length; i++){
      if(arr[i]<0){
        a[j]=arr[i];
        j++;}}
    j=0;
    for(int i=0; i<arr.length; i++,j++){
      arr[i]=a[j];}
    
  }
}
