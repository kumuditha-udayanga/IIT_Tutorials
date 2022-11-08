package Tutorial4.Q5;

public abstract class CreditCard extends Card{
  private int pinNumber;
  private int number;
  public CreditCard (String name, int pin, int cardNumber) {
    super(name);
    pinNumber = pin;
    number = cardNumber;
  }
}
