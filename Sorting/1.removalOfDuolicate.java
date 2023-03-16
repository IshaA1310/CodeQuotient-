


// Return the new size of array, after removing the duplicates
static int removeDuplicates(int arr[], int N) {
  int i=1,j=1;
  for(i=1; i<N; i++){
    if(arr[j-1]!=arr[i]){
      arr[j]=arr[i];
      j++;}
    }
  return j;
}
