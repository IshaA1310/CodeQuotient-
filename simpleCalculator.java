import java.util.Scanner;
class Main{
    public static void main(String[] args)
        {
              Scanner s = new Scanner(System.in);
                    double num1= s.nextDouble();
                          char opr = s.nextLine().charAt(0);
                                double num2 = s.nextDouble();
                                      double result=0;

                                            switch(opr){
                                                      case '+':
                                                                 result=(num1 + num2);
                                                                            System.out.printf("%.2f",result);
                                                                                       break;

                                                                                                 case '-':
                                                                                                             result=(num1 - num2);
                                                                                                                        System.out.printf("%.2f",result);
                                                                                                                                   break;

                                                                                                                                             case '*':
                                                                                                                                                        result=(num1 *num2);
                                                                                                                                                                   System.out.printf("%.2f",result);
                                                                                                                                                                              break;

                                                                                                                                                                                        case '/':
                                                                                                                                                                                                   result=(num1/num2);
                                                                                                                                                                                                              System.out.printf("%.2f",result);
                                                                                                                                                                                                                         break;

                                                                                                                                                                                                                                   default:
                                                                                                                                                                                                                                         }
                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }