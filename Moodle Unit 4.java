import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  //Powerpoint presentation & examples
    //While loops, Works until a condition you choose becomes false
    /*
      while (loop-continuation-condition){
        Statement(s);
      }

      //Example
        int x = 0

        while(x < 100){
          System.out.println("Coding is fun!");
          x++;
        }
    */

    //Do-while loops, executes at least once, then checks the condition
    /*
      do {
        Statement(s);
      } while (loop-continuation-condition);
    */

    //Steps for writing loops
    /*
      1. Initialize loop varible
      2. Test loop variable
      3. Change loop variable
    */

    //Sum
      /*
        int i = 1;
        int sum = 0;
        while(i <= 100){
          sum += i;
          i++;}
        System.out.println(sum);
      */

    //Average
      /*
        int i = 1;
        int sum = 0;
        while(i <= 100){
          i++;
          sum += (int)(Math.random()*99);}
        System.out.println((double)sum / (double)i);
      */

    //Minimum
      /*
        int candidate, minimum = Integer.MAX_Value, count = 0;
        while (count <= 50){
          candidate = (int) (Math.random()*1000);
          if (candidate < minimum){
            minimum = candidate;}
          count++;
        }
        System.out.println(minimum);
      */

    //Maximum
      /*
        Same as minimum but minimum --> maximum = Integer.MIN_Value
      */
    
    //For loops, Works by setting parameters (conditions/requirements) you choose   Slide 41
    /*
      for (initial-action; loop-continuation-condition; action-after-each-iteration){
        Statement(s);
      }

      for (int i = 0; i < 10; i++){
        System.out.println(i); //prints 1-9
      }
    */

    //While loops can be rewritten as for loops and vice versa
      /*
        int i = 1;
        int sum = 0;
        while (sum < 10000) {
        sum += i;
        i++;

        can be rewritten as

        int sum = 0;
        for (int i = 1; sum < 10000; i++){
          s += i;
        }
      */

    //Developing algorithms using Strings
      /*
        String(String str) --> new String object
        int length() --> returns number of characters in a String object
        String substring(int from, int to) --> returns substring of a String object starting at from and ending at to-1
        String substring(int from) --> returns substring(from, length())
        int indexOf(String str) --> returns index of first occurence of str in the calling String object, -1 if not found
        boolean equals(String other) --> returns true if the calling String object is equal to other, false if otherwise
        int compareTo(String other) --> returns a value < 0, 0, or > 0 if the calling String object is <, =, or > other (im guessing length)
      */

    //Nested Loops
      /*
        loops inside a loop

        public static String doSomething(String s){
          final String BLANK = " ";
          String str = "";
          String temp;
          for (int i = 0; i < s.length(); i++){
            temp = s.substring(i, i+1);
            if (temp.equals(BLANK)){
              str += temp;
            }
          return str;
        }
          }
        }
      */

    //Informal Code Analysis
      // it's literally just drawing a table and going through each iteration of the loop and seeing what happens

    
  //PE 4.1 Guessing Game
    //System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
    Scanner input = new Scanner(System.in);
    
    int compRandom = (int)(Math.random() * 101);

    System.out.println("Guess a number between 0 and 100:");
    int userGuess = input.nextInt();

    while (userGuess != compRandom){
      if (userGuess < compRandom){
        System.out.println("Too low, try again:");
        userGuess = input.nextInt();
      }
      else if (userGuess > compRandom){
        System.out.println("Too high, try again:");
        userGuess = input.nextInt();
      }
    }
    System.out.println("You got it!");

    System.out.println();
    

  //PE 4.2 Euler Project 1 (Multiples of 3 and 5)
    int sum = 0;
    for (int i = 3; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    System.out.println(sum);

    System.out.println();

    
  //PE 4.3 Prime Numbers
    System.out.println(isPrime(19));
    System.out.println(isPrime(20));

    System.out.println();


    System.out.println("Please enter a number: ");
    int userNum = input.nextInt();
    System.out.println();

    for (int i = userNum; i > 0; i--){
      if (isPrime(i)){
        System.out.println(i);
      }
    }
    System.out.println();


  //PE 4.4 Euler Project 3 (Largest Prime Factor)
    //System.out.println(largestPrimeFactor(600851475143L)); (takes a long time)


  //PE 4.5 Sum of Digits
    System.out.println(sumOfDigits(569));
    System.out.println(sumOfDigits(1234));
    System.out.println();


  //PE 4.6 Leap Year II
    int sum2 = 0;
    for(int year2 = 2010; year2 <=2020; year2++){
      if(isLeapYear(year2)){
        System.out.println(year2);
        sum2++;
      }
    }
    System.out.println("The amount of leap years is " + sum2);
    System.out.println();

    
  //PE 4.7 Factorial
    System.out.println(factorial(6));
    System.out.println(factorial(17));
    System.out.println();


  //PE 4.8 Fibonacci
    System.out.println("Give a number of terms:");
    int userTerm = input.nextInt();
    int n = userTerm;
    int firstTerm = 0;
    int secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
      System.out.println();
      System.out.println();

    
  //PE 4.9 Reverse String (incomplete)
    System.out.println(printReverse("Hello there!"));
    System.out.println();


  //P.E 4.10 Palindrome String
    System.out.println("Please enter a word: ");
    String userWord = input.next();
    if (printReverse(userWord).equals(userWord)){
      System.out.println(userWord + " is a palindrome.");
    }
    else {
      System.out.println(userWord + " is not a palindrome.");
    }
    System.out.println();


  //P.E 4.11 Palindrome Integer
    System.out.println(reverse(564));
    
    System.out.println("Enter a number to check if it's a palindrome: ");
    int asdf = input.nextInt();
    System.out.println(isPalindrome(asdf));


  //P.E 4.12 Perfect, Abundant and Deficient Numbers
    System.out.println("Enter a number to check if it's perfect, abundant or deficient: ");
    int perfNum = input.nextInt();
    int total = 0;
    for (int i = 1; i < perfNum; i++){
      if (perfNum % i == 0){
        total = total + i;}}
    if (total == perfNum){
      System.out.println(perfNum + " is perfect.");}
    else if (total > perfNum){
      System.out.println(perfNum + " is abundant.");}
    else {
      System.out.println(perfNum + " is deficient.");}
  }
  
  public static boolean isPrime(long number){
      for(int i = 2; i < number; i++){
        if(number % i == 0){
          return false;
        }}
        return true;
  }

  public static long largestPrimeFactor(long numberL){
    long largestPrime = 0;
    for (long i = 2; i < numberL; i++){
      if (numberL % i == 0 && isPrime(i)){
        largestPrime = i;
      }
    }
    return largestPrime;
  }

  public static int sumOfDigits(int num){
    int sum = 0;
    while (num > 0){
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

  public static boolean isLeapYear(int year){
    boolean leapYear = false;
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        leapYear = true;}
      else{
        leapYear = false;}
    return leapYear;
  }

  public static long factorial(int num){
    long product = 1;
      for(int i = num; i > 0; i--){
        product *= i;
      }
    return product;
  }

  public static String printReverse(String str){
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);}
    return rev;
  }

  public static int reverse(int num){
    int revNum = 0;
    while (num != 0){
      int digit = num % 10;
      revNum = revNum * 10 + digit;
      num /= 10;
  }
    return revNum;
  }

  public static boolean isPalindrome(int num){
    if (reverse(num) == num){
      return true;}
    else{
      return false;}
  }
}
