import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<arr.length; i++){
        arr[i] = s.nextInt();}
      int sec =0,a=0;
      int max= arr[0];
      for(int i=1; i<arr.length; i++){
        if (max < arr[i]){
          sec = max;
          max = arr[i];
          a =i;
          }
        }
      for(int i = a+1; i<arr.length; i++){
        if((sec <arr[i])&&(max> arr[i])){
          sec = arr[i];}}
      System.out.println(sec);
      
      
    }
}
