package Birthday;

import java.util.Random;

public class Birthday {
  public static void main(String[] args) {
    int personOne;
    int personTwo;
    int count = 0;
    Random random = new Random();
    boolean isBirthdayEqual = false;
    while (!isBirthdayEqual) {
      personOne = random.nextInt(365);
      personTwo = random.nextInt(365);
      if (personOne == personTwo) {
        System.out.println(personOne +" day is equal to "+ personTwo);
        System.out.println("Number of people entered " + count);
        isBirthdayEqual = true;
      }
      count+=2;
    }
  }
}
