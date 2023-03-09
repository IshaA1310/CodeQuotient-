import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);

      // lcm * hcf = a * b;

      int a = s.nextInt();
      int b= s.nextInt();
      int min =0;
int max =0;
//for storing correct value 

      if (a>b){
        min = b;
        max = a;
}
      else{
        max = b ;
        min = a;
}
      while(max%min != 0){
        int r = max % min ;
        max = min;
        min = r;
}
      int lcm = (a * b)/min ;

      System.out.println(lcm);
      


    }
}
