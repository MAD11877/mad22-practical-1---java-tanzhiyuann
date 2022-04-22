import java.util.Scanner;
import java.util.List;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numbers = in.nextInt();

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < numbers; i++){
      list.add(in.nextInt());
    }
    in.close();
    int checkmode = 0;
    int[] checked = {0};
    

    for (int i = 0; i < list.size(); i++){
      for (int x = i; x < list.size(); x++){
        checkmode = Collections.frequency(list, list.get(i));
        
      }
      if (checkmode > checked[0]){
        checked[0] = i;
      }
    }

    System.out.println(list.get(checked[0]));
    
  }
}
