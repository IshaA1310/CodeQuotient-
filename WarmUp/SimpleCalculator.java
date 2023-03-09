import java.util.Scanner;
public class Main {
        public static void main(String[] args)
        {
          Scanner s = new Scanner(System.in);
          double a = s.nextDouble();
          char opr = s.next().charAt(0);
          double b = s.nextDouble();
          double result =0;
          switch (opr){
              case '+' :
              result = (a+b);
              break;
              
              case '-' : 
              result = (a-b);
              break ;
              
              case '*' :
              result =(a*b);
              break;
              
              case '/' :
              result = (a/b);
              break;
              
              default :
               break ;}

// Decimal upto 2 places
          System.out.printf("%.2f",result);
        }
    
}
