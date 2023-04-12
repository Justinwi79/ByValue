public class ByValue
{
  public static void main(String[] args)
  {
    int a = 5, b = 8, ans;
    ans = myMethod(a, b);
    System.out.println("ans = " + ans);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
  static int myMethod(int x, int y)
  {
    x = x * 2;
    System.out.println("x = " + x);
    y = y * 2;
    System.out.println("y = " + y);
    return x + y;
  }
}