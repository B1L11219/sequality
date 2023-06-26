package sequality;

public class Calculate {
  public String startCalculation() {
    return "Start Calculation";
  }

  public int mul(int a, int b) {
    return a * b;
  }

  public String oddeven(int a) {
    if (a % 2 == 0) {
      return "even";
    } else {
      return "odd";
    }
  }
}
