package Tutorial2.ConcatTester;

public class ConcatTester {
  public static void main(String[] args)
  {
    String animal1 = "quick brown fox ";
    String animal2 = " lazy dog";
    String article = " the";
    String action = "jumps over";

    System.out.println(animal1.concat(action.concat(article.concat(animal2))));
    System.out.println(animal1 + action + article + animal2);
  }
}
