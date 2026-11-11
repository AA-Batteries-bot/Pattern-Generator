// Aaron Johnson
//10/28/26
// This code allows you to input integers to create different partterns.

public class Pattern {

  public static void main(String[] args) {
    stars(7);
    triangle(7);
    odds(10);
    eo(7);
    pyramid(9);
  }
//Precondition: Assign a integer, non null value into the stars method call in main method.
//Postcondition: Result will print the pound sign in ascending order for the number of rows inputted(inclusive).
  public static void stars(int rows) {
    String star = "*";
    String star2 = "**";
    int counter = 0;
    while (counter < rows) {
      System.out.println(star);
      star += star2;
      counter++;

    }
    System.out.println();
    System.out.println();
  }
//Precondition: Assign a integer, non null value into the triangle method call in main method.
//Postcondition: Result will print numbers in acsending order, in the shape of a triangle, up to (inclusive) of the integer inputted.
  public static void triangle(int rows) {
    int counter = 1;
    int number = 1;
    int i = 0;
    while (counter <= rows) {
      while (i < counter) {
        System.out.print(number);
        i += 1;
      }
      System.out.println();
      i = 0;
      counter++;
      number++;
    }
    System.out.println();
    System.out.println();
  }
//Precondition: Assign an integer, non null value into the odds method call in main method.
//Postcondition: Result will print all odd numbers from the input in decending order, while also removing two iterations from the previous line.
  public static void odds(int start) {
    int count = start;
    for (int i = start; i >= 0; i--) {
      if (start % 2 == 1) {
        while (count > 0) {
          System.out.print(start);
          count--;
        }
        start -= 1;
        System.out.println();
      } else {
        start -= 1;
      }

      count = start;

    }
    System.out.println();
    System.out.println();
  }
//Precondition: Assign integer, non null value into eo method call in main method.
//Post condition: Will print a series of E's and O's, depending on if the input was odd or even in acending order, where the largest amount of E's is the inputed number, to which it then decends untill reaching 1 letter 
  public static void eo(int maxE) {
    String output = "E";
    int count = 1;
    int i = 0;
    if (maxE % 2 == 0) {
      output = "O";
    }
    while (count < maxE) {
      while (i < count) {
        System.out.print(output);
        i++;
      }

      if (output.equals("E")) {
        output = "O";

      } else {
        output = "E";

      }
      count++;
      System.out.println();
      i = 0;
    }
    while (count > 0) {
      while (i < count) {
        System.out.print(output);
        i++;
      }

      if (output.equals("E")) {
        output = "O";

      } else {
        output = "E";

      }
      count--;
      System.out.println();
      i = 0;
    }
    System.out.println();
    System.out.println();
  }
//Precondition: Assign an integer, non null value in the method call pyramid, in the main method.
//Postcondition: Creates an upsidedown pyramid starting at one, decending all the way until thier is only one number at the bottom, which was the number inputed, all with even spacing.
  public static void pyramid(int rows) {
    
    int num = 1;
    String space="";
    while(rows >0){
      System.out.print(space);
      int quant = 2* rows-1;
      while(quant >0){
System.out.print(num);
quant --;
      }
      System.out.print(space);
      rows --;
      System.out.println();
      space = space + " ";
  
      num ++;
  
    }
}
    
      }
  


