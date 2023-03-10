import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
      Scanner s = new Scanner (System.in);
      int num = s.nextInt();
      armStrong(num);
    }
  static void armStrong(int num){
    int copy2 = num;
    int copy = num, sum =0, count=0;
    while(copy!=0){
      copy /=10;
      count++;}
    while(num!=0){
      sum +=(int)Math.pow(num%10,count);
      num /=10;
      }
    if(sum == copy2){
      System.out.println("yes");}
    else {
      System.out.println("no");}
}
  }
