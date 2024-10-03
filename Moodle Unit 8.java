public class Main {
  public static void main(String[] args) {
    //PowerPoint Presentation and Examples
    //2D Arrays
    /*
      2D Arrays- arrays that have both rows and columns, array of arrays
      each element of the outer array has a reference to each inner array

      datatype[][] variableName = new datatype[row][col];
      rows and columns are still 0-indexed
      number of elements = number of rows * number of columns

      int[][] ticketInfo = {{25,20,25},
                            {25,20,25}};


      int[2][1] = 5 --> changes the value in the third row and second column to 5
    */

    //Traversing 2D Arrays
    /*
      arr.length- the length of the outer array, the number of rows
      arr[0].length- the length of the inner array, the number of columns

      Looping
      public static int max(int[][] arr){
        int maxVal = arr[0][0];
        for (int r = 0; r < arr.length; r++){
          for (int c = 0; c < arr[0].length; c++){
            if (arr[r][c] > maxVal){
              maxVal = arr[r][c];
            }
          }
        }
        return maxVal;
      }

      Processing 2D Arrays
      Be able to:
        Initialize with input values or random values
        Displaying
        Summing all the elements
        Summing elements by row/column
        Finding the row or column with the largest/smallest sum
        Shuffling elements (more advanced technique)

      Common Mistakes:
        forgetting to create it (only writing int[][] nums;)
        using 1 as the first index and not 0
        using array.length (worng) instead of array.length-1 (right)
          same with index <= array.length (wrong) instead of index < array.length (right)
        using array[0].length (wrong) as the last valid column index, not array[0].length - 1
        only length, not length() or size()
        jumping out of loop early (be careful with return statements)
        using array.length for the number of rows AND the number of columns (only for rows)

        all standard 1D array algorithms work for 2D arrays
    */

    //P.E 8.1 - Basic 2D Array Processing
      int[][] arr1 = new int[10][10];
      for (int r = 0; r < 10; r++){
        for (int c = 0; c < 10; c++){
          arr1[r][c] = (int)(Math.random()*100);
        }
      }

      //Printing 2D Array
      for (int r = 0; r < 10; r++){
        for (int c = 0; c < 10; c++){
          System.out.println(arr1[r][c]);
        }
      }

      //summing all elements
      int sum = 0;
      for (int r = 0; r < 10; r++){
        for (int c = 0; c < 10; c++){
          sum += arr1[r][c];
        }
      }
      System.out.println("Sum of all: " + sum);

      //Summing elements by row
      int sum1 = 0
      for (int c = 0; c < 10; c++){
        sum1 += arr1[0][c];
      }
      System.out.println("Sum of first row: " + sum1);

      //Summing elements by column
      int sum2 = 0;
      for (int r = 0; r < 10; r++){
        sum1 += arr1[r][0];
      }
      System.out.println("Sum of first column: " + sum2);

      //Largest Sum (row)
      
  }
}
