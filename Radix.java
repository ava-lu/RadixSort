public class Radix {
  public static int nth(int n, int col) {
    int temp = Math.abs(n / (int)Math.pow(10, col));
    return (temp % 10);
  }
}