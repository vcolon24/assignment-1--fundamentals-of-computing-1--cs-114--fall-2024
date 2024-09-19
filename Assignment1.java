import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("VV      VV CCCCCCCC");
    System.out.println(" VV    VV  CC      ");
    System.out.println("  VV  VV   CC      ");
    System.out.println("   VVVV    CC      ");
    System.out.println("    VV     CCCCCCCC");

    System.out.print("please enter a tempeture in fahrenheit: \n");
    final int BASE = 32;
    final double CONVERSION_FACTOR = 9.0 / 5.0;

    double fahrenheitTemp;
    int celsiusTemp = 0;  // value to convert

    fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

    System.out.println(+ fahrenheitTemp);
    System.out.print("please enter a 5-string character: \n");
    String originalstring = "vahlc";
    StringBuilder sb = new StringBuilder(originalstring);
    String reversedString = sb.reverse().toString();
    System.out.println(originalstring);

    System.out.print("Random number generated. continuing... \n");
    
    Random random = new Random();
    int randomNumber = 32 + random.nextInt(16353); // Generates a number between 32 and 16384
    String substring = reversedString.substring(1, 4);
    String.format("%.2f", randomNumber / 100.0);
    System.out.println("your new string is " + substring + randomNumber);
  }

  }
