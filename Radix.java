public class Radix {
  public static int nth(int n, int col) {
    int temp = Math.abs(n / (int)Math.pow(10, col));
    return (temp % 10);
  }
  public static int length(int n) {
    if (n==0) return 1;
    else return (int)(Math.log10(Math.abs(n))+1);
  }
  public static void merge(SortableLinkedList original,
  SortableLinkedList[] buckets) {
    for (int i=0; i<buckets.length; i++) {
      original.extend(buckets[i]);
    }
  }
  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i=0; i<=9; i++) {
      buckets[i] = new SortableLinkedList();
    }
    int digit = 0;
    boolean goon = true;
    int current = 0;
    while (goon==true) {
      goon = false;
      while (data.size()>0) {
        current = data.remove(0);
        int m = nth(current, digit);
        buckets[m].add(current);
        if (length(current)>current+1) goon=true;
      }
      digit++;
    }
    merge(data, buckets);
  }
}
