package Tutorial4.Q5;

public abstract class DriverLicense extends Card {
  private int expirationYear;
  public DriverLicense (String name, int expYear) {
    super(name);
    expirationYear = expYear;
  }
}
