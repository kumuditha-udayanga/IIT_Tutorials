package Tutorial3.Q4;

public class Cat {
  private String colour;

  public Cat (String colour1) {
    colour = colour1;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public Cat create() {
    Cat c = new Cat("Brown");
    System.out.println("\nInside Cat.create(), address of created " +
            " cat object c is: "+ c);

    return c;
  }
}
