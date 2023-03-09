import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
      Scanner s = new Scanner (System.in);
      int num = s.nextInt();
      int sum = 0;
      
      //loop goes to the -1 condition 
      for (int i=1; i<num; i++){
        if(num % i == 0){
          sum += i ;}
        }
      
      // for checking both numbers are same or not
      if (sum == num){
        System.out.println("yes");
        }else {
        System.out.println("no");}
    }
}
