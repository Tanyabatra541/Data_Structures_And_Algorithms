public class FibonacciSeriesRecursion {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    int n=1;
    fib(a,b, n);
  }
  
  static void fib(int a, int b, int n){
    if(n==7){
      return;
    }
    System.out.println(a+b);
    n++;
    fib(b,a+b, n);
  }
}
