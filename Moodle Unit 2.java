import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in); //remember the syntax for scanners
    
  //Powerpoint presentation examples
    /*
      \b --> backspace
      \t --> tab
      \n --> new line
      \f --> form feed (tells printer to eject current page and continue printing on another)
      \r --> carriage return (moves cursor to beginning of line)
      \\ --> backslash
      \" --> double quote
    */
    
      System.out.print("\\* This is not\n a comment *\\");
      System.out.println();
      System.out.println();

      String message1 = 4 + 3 + "12";
      System.out.println(message1); //"712"
      String message2 = "12" + 4 + 3;
      System.out.println(message2); //"1243"
      String message3 = "12" + (4 + 3);
      System.out.println(message3); //"127"
      System.out.println();

    /*
    Order of Operations (VERY IMPORTANT)
      Parenthesis
      Increment and Decrement
      Casting
      Multi, Divis, Modulus (remainder)
      Add, Subt, String Concatenation
      Assignment operators (=, +=, -=, *=. /=, %=)
    */

    //String Equality
      String s1 = "hello";
      String s2 = "hello";
      System.out.println(s1 == s2); //true
      System.out.println(s1.equals(s2)); //true //case sensitive
      System.out.println();

    //Character Type / Method
      //Type
        char ch1 = 'A'; //A to Z is 65 to 90
        char ch2 = 97; //a to z is 97 to 122
        //0 to 9 is 48 to 57
        System.out.println(ch1 + " " + ch2); //A a

      //Method
        /*
          isDigit(ch) --> true if character is a digit
          isLetter(ch) --> true if character is a letter
          isLetterOrDigit(ch) --> true if character is a letter or digit
          isLowerCase(ch) --> true if character is lowercase
          isUpperCase(ch) --> true if character is uppercase
          toLowerCase(ch) --> returns lowercase of specified letter
          toUpperCase(ch) --> returns uppercase of specified letter
        */
      System.out.println();

    //substring (VERY IMPORTANT)
      String s = "Enter three words separated by spaces.";
      System.out.println(s.substring(0, 7)); //Enter t
      System.out.println(s.substring(6, 16)); //three word
      System.out.println(s.substring(6)); //three words separated by spaces.
      System.out.println();

      //String methods ()
        /*
          length() --> returns length of string
          charAt(index) --> returns character at specified index
          concat(s1) --> returns concatenation of this string w string s1
          toUpperCase() --> returns uppercase of string (all letters)
          toLowerCase() --> returns lowercase of string (all letters)
          trim() --> returns a string with leading and trailing whitespace removed
          equals(s1) --> returns true if this string is equal to string s1 (case sensitive)
          equalsIgnoreCase(s1) --> same as equals but case insensitive
          compareTo(s1) --> returns int less than 0, 0, or more than 0 depending on length
          compareToIgnoreCase(s1) --> same as compareTo but case insensitive
          startsWith(prefix) --> returns true if this string starts with specified prefix
          endsWith(suffix) --> returns true if this string ends with specified suffix
          contains(s1) --> returns true if this string contains specified substring s1
          index(ch) --> returns index of first occurrence of specified character ch (-1 if nothing, true of all string .index methods)
          indexOf(ch, fromIndex) --> same as index(ch) but after fromIndex
          indexOf(s) --> returns index of first occurrence of specified substring s
          indexOf(s, fromIndex) --> same as indexOf(s) but after fromIndex
          lastIndexOf(ch) --> returns index of last occurrence of ch
          lastIndexOf(ch, fromIndex) --> same as lastIndexOf(ch) but after fromIndex
          lastIndexOf(s) --> returns index of last occurrence of substring s
          lastIndexOf(s, fromIndex) --> same as lastIndexOf(s) but after fromIndex
        */

    //Wrapping - Integers and Doubles
      /*
        Boxing- primitive to wrapper class (int --> Integer) (java makes it automatic when needed)
        Unboxing- wrapper class to primitive (double --> Double) (java makes it automatic when needed)
        Integer(int value) --> new Integer object representing specified int value
        Integer.MIN_VALUE --> minimum value represented by an int or Integer
        Integer.MAX_VALUE --> maximum value represented by an int or Integer
        int intValue() --> returns the value of this Integer as an int
        Double(double value) --> new Double object representing specified
        double doubleValue() --> returns the value of this Double as a double
      */

        //Integer i = new Integer(2);, create an object with 2 in it (strikethrough bc its java 8)
        //Double d = new Double(2.5);, create an object with 2.5 in it (strikethrough bc its java 8)


    
    Double x = 3.5;
    System.out.println(x.intValue()); //3
    System.out.println(x.compareTo(4.5)); //-1
    System.out.println();

    //static Methods
      /*
        class and static methods --> Class or static methods are in the object that defines the class and can be accessed directly from the class (you can but don't NEED to create an object to use)
      */
    
    //math stuff
      System.out.println(Math.abs(-1)); //absolute value (1)
      System.out.println(Math.abs(-3.5)); //absolute value (3.5)
      System.out.println(Math.pow(3.0, 4.0)); //power (3.0^4.0) (81.0)
      System.out.println(Math.sqrt(225)); //square root (15.0)
      System.out.println(Math.exp(2)); //e^2 (7.389)
      System.out.println(Math.log(2)); //ln(x) (0.693))
      System.out.println(Math.log10(2)); //log base 10 of 2 (0.301)
      System.out.println();
    //rounding methods
      /*
        ceil(x) --> rounds up to the nearest integer (returned as double)
        floor(x) --> rounds down to the nearest integer (returned as double)
        rint(x) --> rounds to the nearest integer (returned as double)
        round(x) --> returns (int)Math.floor(x+0.5) if float and (long)Math.floor(x+0.5) if double

        int --> long, double --> float, difference is length (long and double are the larger ones)
      */
    
    //area of a circle
      final double PI= 3.14; //final variables cannot have their values changed
      double radius;
      double area;
    
      System.out.print("Please enter the radius: ");
      radius = input.nextDouble();

      area = PI*radius*radius; //can also say Math.pow(radius, 2.0)
      System.out.println("The area of the circle of radius "+ radius + " is " + area );

    //random numbers
      System.out.println((int)(Math.random()*10)); //1 to 9, can add 1 to whole thing for 10
      System.out.println(50 + (int)(Math.random()*50)); //50 to 99

      //a + (int)(Math.random()*b) is a random number between a to a+b, excluding a+b

  //PE 2.1
    System.out.println("Print a subtotal (with decimal): ");
    double subtotal = input.nextDouble();
    System.out.println("Print a tax percentage (as a decimal): ");
    double tax = input.nextDouble();
    System.out.println("Print a tip percentage (as a decimal): ");
    double tip = input.nextDouble();
    double total = subtotal + (subtotal*tax) + (subtotal*tip);

    System.out.println("Subtotal: " + subtotal);
    System.out.println("Tax: " + subtotal*tax);
    System.out.println("Tip: " + subtotal*tip);
    System.out.println("Total: " + total);

  //MCQ practice
    System.out.println("13" + 5 + 3); //"1353"

    System.out.println(3 + 5 + "13" + 5 + 6); //"81356"
  }
}
