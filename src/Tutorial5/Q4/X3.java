package Tutorial5.Q4;

public class X3 extends X2 {
  @Override
  public void foo() {
    System.out.println("foo() called in X3");
  }
}

// Reason: The foo method was final therefore it cannot be overridden
// X1 one cannot be inherited or extended because it's a final class
