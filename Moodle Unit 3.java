import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    
   
    /*
      Java operator --> mathematical symbol
      < --> <
      > --> >
      <= --> less than or equal to
      >= --> greater than or equal to
      == --> =
      != --> not equal to
    */

    // if statements (true --> runs)
      /*
        single if statement (don't NEED brace if sinlgle statement)
          if (boolean expression)
            Do statement;

        block if statement
          if (boolean expression) {
            Do statement1;
            Do statement2;
            ...
            Do statementN;
          }
      */

    //if-else statements (true --> runs if statements; false --> runs else statement)
      /*
        if (boolean expression){ //braces not NEEDED for if or else statements if only 1 line
          statement(s)-for-true-case
        }
        else{
          statement(s)-for-false-case
        }

        watch out for missing braces, bogus semicolons, redundant testing of booleans, and dangling else statements (create ambiguity)
      */

    //else-if statements
      /*
        if (score >= 90.0)
          System.out.print("A");
        else if (score >= 80.0)
          System.out.print("B");
        else if (score >= 70.0)
          System.out.print("C");
        else if (score >= 60.0)
          System.out.print("D");
        else
          System.out.print("F");
      */

    //Compound boolean expressions
      /*
        ! --> not
        && --> and
        || --> or
        ^ --> exclusive or
      */
    
      // p = true --> p! = false (and vice versa)
    
      // p1 = false; p2 = false --> p1 && p2 = false
      // p1 = false; p2 = true --> p1 && p2 = false
      // p1 = true; p2 = false --> p1 && p2 = false
      // p1 = true; p2 = true --> p1 && p2 = true

      // p1 = false; p2 = false --> p1 || p2 = false
      // p1 = false; p2 = true --> p1 || p2 = true
      // p1 = true; p2 = false --> p1 || p2 = true
      // p1 = true; p2 = true --> p1 || p2 = true

      // p1 = false; p2 = false --> p1 ^ p2 = false
      // p1 = false; p2 = true --> p1 ^ p2 = true
      // p1 = true; p2 = false --> p1 ^ p2 = true
      // p1 = true; p2 = true --> p1 ^ p2 = false

      //Operator precedence
        /*
          Parenthesis first
          ! before ^
          ^ before &&
          && before ||
        */

    // Negation of logical operators
      /*
        when negated:
        < --> >=
        >= --> <
        > --> <=
        <= --> >
        == --> !=
        != --> ==
      */

    //De Morgan's Laws
      /*
        !(p && q) --> !p || !q
        !(p || q) --> !p && !q
      */

    //Aliases
      /*
        Two objecy references are aliases when they both reference the same object
        Can be compared using == or != for identification
        Reference can be compared to null to see if it actually references something
        Often classes have their own equals method
      */

    Scanner input = new Scanner(System.in);
    
  //PE 3.1 - Leap Year I (not a method but works when inputting a value)
  System.out.print("Please enter a year: ");
    int year = input.nextInt();
    boolean leapYear = false;
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        leapYear = true;}
      else{
        leapYear = false;}
    System.out.println(year + " is a leap year: " + leapYear);

    System.out.println();


  //PE 3.2 - Lottery (not a method but works when inputting a variable)
  //when guess is 1 digit, gets $10 when winner is multiple of 10
    /*
      From console:
        Please enter your guess(1-99): 1
        Congruations! Your prize: $10

        The lottery number was 80
    */

    int winner = 1 + (int)(Math.random()*99);
    System.out.print("Please enter your guess(1-99): ");

    int guess = input.nextInt();

    int gTensDigit = guess / 10;
    int gOnesDigit = guess % 10;

    int wTensDigit = winner / 10;
    int wOnesDigit = winner % 10;

      if (guess > 99)
        System.out.println("Invalid guess. Sorry, no prize.\n ");
      else if (guess == winner)
        System.out.println("Congratulations! Your prize: $100\n");
      else if (gOnesDigit == wTensDigit && gTensDigit == wOnesDigit)
        System.out.println("Congratulations! Your prize: $50\n");
      else if (gTensDigit == wTensDigit || gTensDigit == wOnesDigit || gOnesDigit == wTensDigit || gOnesDigit == wOnesDigit)
        System.out.println("Congruations! Your prize: $10\n");
      else
        System.out.println("Sorry, no prize.\n");
        System.out.println("The lottery number was " + winner);

    System.out.println();
    System.out.println();


  //PE 3.3 - Pizza Selection

    double smallPizza = 9.25;
    double mediumPizza = 10.25;
    double largePizza = 12.50;
    double xLargePizza = 15.25;

    int smallDiameter = 12;
    int mediumDiameter = 14;
    int largeDiameter = 16;
    int xLargeDiameter = 18;

    double aSmall = (smallDiameter / smallPizza);
    double bMedium = (mediumDiameter / mediumPizza);
    double cLarge = (largeDiameter / largePizza);
    double dXLarge = (xLargeDiameter / xLargePizza);

    if (aSmall < bMedium && aSmall < cLarge && aSmall < dXLarge)
      System.out.println("The small pizza has the best value.");
    else if (bMedium < aSmall && bMedium < cLarge && bMedium < dXLarge)
      System.out.println("The medium pizza has the best value.");
    else if (cLarge < aSmall && cLarge < bMedium && cLarge < dXLarge)
      System.out.println("The large pizza has the best value.");
    else if (dXLarge < aSmall && dXLarge < bMedium && dXLarge < cLarge)
      System.out.println("The X-Large pizza has the best value.");

    
  //PE 3.4 - Cookie Selection    
        
    System.out.println("How many Ritz Bits packs do you have?: ");
    int rBits = input.nextInt();

    System.out.println("How many Nutter Butter packs do you have?: ");
    int nButter = input.nextInt();

    System.out.println("How many Chips Ahoy packs do you have?: ");
    int cAhoy = input.nextInt();

    System.out.println("How many Oreo packs do you have?: ");
    int Oreo = input.nextInt();
    
    if (rBits > 0){
      System.out.println("Take a Ritz Bits pack");}
    
    else if (nButter > cAhoy && nButter > Oreo){
      System.out.println("Take a Nutter Butter pack.");}
    
    else if (cAhoy > nButter && cAhoy > Oreo){
      System.out.println("Take a Chips Ahoy pack.");}
    
    else if (Oreo > nButter && Oreo > cAhoy){
      System.out.println("Take an Oreo pack.");}
    
    else if ((nButter == Oreo && nButter > Oreo)||(nButter == Oreo && nButter > cAhoy)){
      System.out.println("Take a Nutter Butter pack.");}
    
    else if (cAhoy == Oreo && cAhoy > nButter){
      System.out.println("Take a Chips Ahoy pack.");}
    
    else {
      System.out.println("Leave for your daughter.");}

    System.out.println();

        /*
          makes it easier to read
          // final int ROCK = 1;
          // final int PAPER = 2;
          // final int SCISSORS = 3;
            if (userChoice.equals("R") && compChoice == ROCK){
              System.out.println(userChoice + " vs. Rock");
              System.out.println("It's a tie!");
            }
        */    

  //PE 3.5 - Rock, Paper, Scissors
    int compChoice = 1 + (int)(Math.random()*3); //1-Rock, 2-Paper, 3-Scissors

    System.out.println("Enter your choice (R-Rock, P-Paper, S-Scissors): ");
    String userChoice = input.next();

    if (userChoice.equals("R") && compChoice == 1){
      System.out.println(userChoice + " vs. Rock");
      System.out.println("It's a tie!");
    }
    else if (userChoice.equals("R") && compChoice == 2){
      System.out.println(userChoice + " vs. Paper");
      System.out.println("You lose!");
    }
    else if (userChoice.equals("R") && compChoice == 3){
      System.out.println(userChoice + " vs. Scissors");
      System.out.println("You win!");
    }
    else if (userChoice.equals("P") && compChoice == 1){
      System.out.println(userChoice + " vs. Rock");
      System.out.println("You win!");
    }
    else if (userChoice.equals("P") && compChoice == 2){
      System.out.println(userChoice + " vs. Paper");
      System.out.println("It's a tie!");
    }
    else if (userChoice.equals("P") && compChoice == 3){
      System.out.println(userChoice + " vs. Scissors");
      System.out.println("You lose!");
    }
    else if (userChoice.equals("S") && compChoice == 1){
      System.out.println(userChoice + " vs. Rock");
      System.out.println("You lose!");
    }
    else if (userChoice.equals("S") && compChoice == 2){
      System.out.println(userChoice + " vs. Paper");
      System.out.println("You win!");
    }
    else if (userChoice.equals("S") && compChoice == 3){
      System.out.println(userChoice + " vs. Scissors");
      System.out.println("It's a tie!");
    }
    else {
      System.out.println("Invalid input. Please try again. (case-sensative)");
    }

    System.out.println();
    

  //PE 3.6 - Rock Paper Scissors Lizard Spock
    int compCHoice = 1 + (int)(Math.random()*5); //1-Rock, 2-Paper, 3-Scissors, 4-Lizard, 5-Spock

    System.out.println("Enter your choice (R-Rock, P-Paper, S-Scissors, L-Lizard, Sp- Spock): ");
    String userCHoice = input.next();

    if (userCHoice.equals("R") && compCHoice == 1){
      System.out.println(userCHoice + " vs. Rock");
      System.out.println("It's a tie!");
    }
    else if (userCHoice.equals("R") && compCHoice == 2){
      System.out.println(userCHoice + " vs. Paper");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("R") && compCHoice == 3){
      System.out.println(userCHoice + " vs. Scissors");
      System.out.println("You win!");
    }
    else if (userCHoice.equals("R") && compCHoice == 4){
      System.out.println(userCHoice + " vs. Lizard");
      System.out.println("You win!");
    }
    else if (userCHoice.equals("R") && compCHoice == 5){
      System.out.println(userCHoice + " vs. Spock");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("P") && compCHoice == 1){
      System.out.println(userCHoice + " vs. Rock");
      System.out.println("You win!");
    }
    else if (userCHoice.equals("P") && compCHoice == 2){
      System.out.println(userCHoice + " vs. Paper");
      System.out.println("It's a tie!");
    }
    else if (userCHoice.equals("P") && compCHoice == 3){
      System.out.println(userCHoice + " vs. Scissors");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("P") && compCHoice == 4){
      System.out.println(userCHoice + " vs. Lizard");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("P") && compCHoice == 5){
      System.out.println(userCHoice + " vs. Spock");
      System.out.println("You win!");
    }
    else if (userCHoice.equals("S") && compCHoice == 1){
      System.out.println(userCHoice + " vs. Rock");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("S") && compCHoice == 2){
      System.out.println(userCHoice + " vs. Paper");
      System.out.println("You win!");
    }
    else if (userCHoice.equals("S") && compCHoice == 3){
      System.out.println(userCHoice + " vs. Scissors");
      System.out.println("It's a tie!");
    }
    else if (userCHoice.equals("S") && compCHoice == 4){
      System.out.println(userCHoice + " vs. Lizard");
      System.out.println("You win!");
    }
    else if (userCHoice.equals("S") && compCHoice == 5){
      System.out.println(userCHoice + " vs. Spock");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("L") && compCHoice == 1){
      System.out.println(userCHoice + " vs. Rock");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("L") && compCHoice == 2){
      System.out.println(userCHoice + " vs. Paper");
      System.out.println("You win!");
    }
    else if (userCHoice.equals("L") && compCHoice == 3){
      System.out.println(userCHoice + " vs. Scissors");
      System.out.println("You lose!");
    }
    else if (userCHoice.equals("L") && compCHoice == 4){
      System.out.println(userCHoice + " vs. Lizard");
      System.out.println("It's a tie!");
    }
    else if (userCHoice.equals("L") && compCHoice == 5){
      System.out.println(userCHoice + " vs. Spock");
      System.out.println("You win!");
    }
      else if (userCHoice.equals("Sp") && compCHoice == 1){
        System.out.println(userCHoice + " vs. Rock");
        System.out.println("You win!");
      }
      else if (userCHoice.equals("Sp") && compCHoice == 2){
        System.out.println(userCHoice + " vs. Paper");
        System.out.println("You lose!");
      }
      else if (userCHoice.equals("Sp") && compCHoice == 3){
        System.out.println(userCHoice + " vs. Scissors");
        System.out.println("You win!");
      }
      else if (userCHoice.equals("Sp") && compCHoice == 4){
        System.out.println(userCHoice + " vs. Lizard");
        System.out.println("You lose!");
      }
      else if (userCHoice.equals("Sp") && compCHoice == 5){
        System.out.println(userCHoice + " vs. Spock");
        System.out.println("It's a tie!");
      }
    else {
      System.out.println("Invalid input. Please try again. (case-sensative)");
    }


    
  }
}
