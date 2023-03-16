import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      int testcase = s.nextInt();
      while(testcase!=0){
        int size=s.nextInt();
        int el = s.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
          arr[i]=s.nextInt();}
        duplicate (arr,el);
        testcase--;}
    }
  static void duplicate (int arr[],int k){
    int count=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==k){
        count++;}
      }
    if(count==0){
      System.out.println("0");}
    else{
      System.out.println(count);}
    }
}
