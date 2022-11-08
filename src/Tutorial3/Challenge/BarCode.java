package Tutorial3.Challenge;

public class BarCode {
  public  BarCode () {
  }
  public void convertedBarCode (String barCode) {
    String[] binaryArr = new String[5];
//    String[] pattern = new String[]
    String temp;
    String digit;
    for (int i = 0; i < barCode.length(); i++) {
      System.out.println(barCode.charAt(i));
      binaryArr[i] = Integer.toBinaryString(barCode.charAt(i));;
    }

    for (int i = 0; i < binaryArr.length; i++) {
      temp = binaryArr[i];
      for (int n = 0; n < temp.length(); n++) {
        digit = String.valueOf(temp.charAt(n));
        if (digit.equals("1")) {
          System.out.print("|");
        } else {
          System.out.print(":");
        }
      }
    }
  };
}
