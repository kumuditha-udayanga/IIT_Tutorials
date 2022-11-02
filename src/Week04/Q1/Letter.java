package Week04.Q1;

public class Letter implements Printable{
  private String text;
  public Letter () {
    text  = "The is the text";
  }
  @Override
  public void print() {
    System.out.println(this.text);
  }
}
