public class HelloNumbers {
  public static void main(String[] args) {
    int x = 0;
    int step = 1;
    while (x <= 45) {
      System.out.print(x + " ");
      x = x + step;
      step++;
    }
  }
}
