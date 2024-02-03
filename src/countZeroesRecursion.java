public class countZeroesRecursion {
  static int count = 0;
  static int countZeroes(int n){
    if(n==0) {
      return 0;
    }
    int rem = n%10;
    if(rem == 0) {
      count++;
    }
    countZeroes(n/10);
    return count;
  }
  public static void main(String[] args) {
    System.out.println(countZeroes(302040));
  }
}
