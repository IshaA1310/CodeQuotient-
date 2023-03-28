import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int testcase = s.nextInt();
    while(testcase!=0){
      int size= s.nextInt();
      int arr[][] = new int[size][size];
      for(int i=0; i<size; i++){
        for(int j=0; j<size; j++){
          arr[i][j]= s.nextInt();}}
      halfRotate(arr, size);
      System.out.println();
      testcase-- ;
  }
    }
   static void halfRotate(int arr[][], int size){
     for(int i=0; i<size; i++){
       for(int j=0; j<i; j++){
         int temp = arr[i][j];
         arr[i][j]=arr[j][i];
         arr[j][i]=temp;}}
     for(int i=0;i<size; i++){
       for(int j=0; j<size/2; j++){
         int temp= arr[i][j];
         arr[i][j]=arr[i][size-1-j];
         arr[i][size-1-j]=temp;
         }}
    
     for(int i =0; i<size; i++){
       for(int j=0; j<size; j++){
if(j== size -1){
System.out.print(arr[i][j]);
System.out.println();
} else{
         System.out.print(arr[i][j]+" ");}
}
     }
}
}
