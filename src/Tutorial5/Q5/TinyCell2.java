package Tutorial5.Q5;

class TinyCell2 extends Cell2 {
  TinyCell2() {
    super(5);
    System.out.println("TinyCell2 constructor called");
  }
}
// Because the TinyCell2 is extended from Cell2 and Cell2 class (super class) has a constructor requiring an argument