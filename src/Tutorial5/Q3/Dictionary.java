package Tutorial5.Q3;

public class Dictionary extends Book {
  private int words;
  Dictionary(int words, int pages) {
    super(12);
    this.words = words;
  }
  public String toString () {
   return "pages: " + super.toString() + " words: " + words;
  }
}
