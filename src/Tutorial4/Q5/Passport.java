package Tutorial4.Q5;

public abstract class Passport extends Card{
  private String birthLocation;
  private int expirationYear;
  public Passport (String name, String birthLoc, int expYear) {
    super(name);
    birthLocation = birthLoc;
    expirationYear = expYear;
  }
}
