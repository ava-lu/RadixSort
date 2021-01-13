public class Radix {
  public static int nth(int n, int col) {
    int temp = Math.abs(n / (int)Math.pow(10, col));
    return (temp % 10);
  }
  public static int length(int n) {
    return String.valueOf(n).length();
  }
  public static void merge(SortableLinkedList original,
  SortableLinkedList[] buckets) {
    for (int i=0; i<buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }
}
