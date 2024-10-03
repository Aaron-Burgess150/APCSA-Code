import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  //Programming exercise (PE) 1.1
    System.out.println("Hello, world!");
    System.out.println();
  
  //PE 1.2 - switch values of m and n
    int m = 0;
    int n = 0;
    int temp = m; //this
    m = n; //this
    n = temp; //and this
    System.out.println();

  //PE 1.3 - Time conversion
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer for seconds: ");
    int seconds = input.nextInt();
    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60; //% is modulus, the remainder after dividing
    System.out.println(seconds + "is " +minutes+"minutes and " +remainingSeconds +"seconds");
    System.out.println();

  //PE 1.4 - Money counter
    //Scanner input = new Scanner(System.in); //needed for the user input

    System.out.println("Please enter a dollar amount with the cents (leave out the dollar sign): ");
    double money = input.nextDouble(); //user input for money (declared and intialized varible)
    int cents = (int) (money * 100); // declared and intialized the total amount of money in pennies
    int wholeDollar = (cents / 100); //declared and initialized the total amount of whole dollars
    int remainingCents = (cents % 100); //declared and initialized the amount of cents from the total, shows 98 when the amount is actually 99 and idk why
    int inQuarters = (remainingCents / 25); //declared and initialized the amount of cents from the total in whole quarters
    int inDimes = (remainingCents / 10); //declared and initialized the amount of cents from the total in whole dimes
    int inNickels = (remainingCents / 5); //declared and initialized the amount of cents from the total in whole nickels
    
    System.out.println("");
    System.out.println("The amount of whole dollars is: " + wholeDollar); 
    System.out.println("The amount of remaining cents is: " +remainingCents);
    System.out.println("This is the amount of pennies.");
    System.out.println("");
    System.out.println("The amount of remaining cents in quarters is: " + inQuarters);
    System.out.println("The amount of remaining cents in dimes is: " + inDimes);
    System.out.println("The amount of remaining cents in nickels is: " + inNickels);
    System.out.println();

  //Optional extra practice (Set 1)
    System.out.println("Welcome to Java!");
    System.out.println("Welcome to AP Computer Science A.");
    System.out.println("Mr. Dominguez is the GOAT!");
    System.out.println("Programming is fun!");
    System.out.println();

  //Optional extra practice (Set 2)
    for(int i = 1; i < 5; i++) {
      System.out.println(i + "   " + Math.pow(i, 2) + "   " + Math.pow(i, 3) + "   ");
    }
    System.out.println();

  //Optional extra practice (BMI)
    //Scanner input = new Scanner(System.in); //creates new object from Scanner class
    System.out.println("Enter weight in pounds (include decimal):");
    double weight = input.nextDouble(); //variable
    System.out.println("Enter height in inches (include decimal):");
    double height = input.nextDouble(); //variable

    double weightKg = weight * 0.45359237; //new variable
    double heightM = height * 0.0254; //new variable
    double BMI = weightKg / (heightM * heightM); //actual BMI
    System.out.println("Your BMI is " +BMI);
    System.out.println();

  //Optional extra practice (Wind Chill Temp)
    System.out.println("Enter outside temperature (between -58 and 41 F): "); //prompt
    //Scanner input = new Scanner(System.in); //allows for user input
    double outsideTemp = input.nextDouble(); //user input
    System.out.println("Enter windspeed (above or equal to 2 mph"); //prompt
    double windSpeed = input.nextDouble(); //user input
    double trueWindSpeed = Math.pow(windSpeed, 0.16); //exponent

    double windChillTemp = 35.74 + (0.6215 * outsideTemp) - (35.75 * (trueWindSpeed)) + (0.4275 * outsideTemp * (trueWindSpeed)); //windchill temp
    System.out.println("The wind chill temperature is " +windChillTemp); //result
  }
 
}
