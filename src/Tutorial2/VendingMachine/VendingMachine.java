package Tutorial2.VendingMachine;

public class VendingMachine {
  private int token;
  private int cans;

  public VendingMachine(int inputToken, int currentCans) {
    this.token = inputToken;
    this.cans = currentCans;
  }
  public void fillIt (int newCans) {
    cans += newCans;
    System.out.println("Number of cans: "+ cans);
  }

  public void insertToken () {
    token += 1;
    cans -= 1;
    System.out.println("Token count: "+ token);
    System.out.println("Remaining of cans: "+ cans);
  }
}
