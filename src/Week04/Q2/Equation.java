package Week04.Q2;

interface Equation {
  int numberOfVariables = 2;
  private double solve();
  public void printFormula() {
    System.out.println("x^2 + 3x + 1");
  }
//  In a interface we can only define abstract methods (does not require implementation in declaration )
}
