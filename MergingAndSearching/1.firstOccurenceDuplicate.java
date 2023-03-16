import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      int testcase = s.nextInt();
      while(testcase!=0){
        int size = s.nextInt();
        int k = s.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
          arr[i]=s.nextInt();}
        index(arr,k);
        testcase--;}
      
    }
  static void index(int arr[] ,int k){
    int count=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==k){
        count++;
        System.out.println(i);
        break;}
      }
    if(count==0){
      System.out.println("-1");}
}
  }
