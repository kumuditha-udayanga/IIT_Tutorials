package Tutorial4.Q1;

public class Student implements Printable{
  String name;
  String[] studentGrades = new String[5];

  public Student () {
    name = "Student Name";
    studentGrades[0] = "Grade 1";
    studentGrades[1] = "Grade 2";
    studentGrades[2] = "Grade 3";
    studentGrades[3] = "Grade 4";
    studentGrades[4] = "Grade 5";
  }

  @Override
  public void print() {
    System.out.println(this.name);
    for(int i = 0; i < studentGrades.length; i++) {
      System.out.println(studentGrades[i]);
    }
  }
}
