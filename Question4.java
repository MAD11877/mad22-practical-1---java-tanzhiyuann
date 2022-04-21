import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */


     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    in.close();
    for (int i = num + 1 ; i > 0; i--){
      System.out.println();
      for (int x = i - 1 ; x > 0 ; x--){
        System.out.print("*");

      }
    }
    
  }

}
