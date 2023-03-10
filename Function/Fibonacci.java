static void fib_sequence(int n) {
  long fib,fibN=0,fibNm=1;
  if(n==1){
    System.out.println(fibN);}
  else if(n>=2){
    System.out.println(fibN);
    System.out.println(fibNm);
    for(int i=3; i<=n ; i++){
      fib = (fibN + fibNm );
      System.out.println(fib);
      fibN = fibNm;
      fibNm = fib;
      }
    }
}
