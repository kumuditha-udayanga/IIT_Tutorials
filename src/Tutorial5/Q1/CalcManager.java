package Tutorial5.Q1;

public class CalcManager {
  static boolean isEven(int n) {
    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  static int cube(int n) {
    return n * n * n;
  }

  static double add (double ...x) {
    double sum = 0;
    for (int i = 0; i < x.length; i++) {
      sum += x[i];
    }
    return sum;
  }
}
