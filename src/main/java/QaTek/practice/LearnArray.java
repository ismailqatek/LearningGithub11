package QaTek.practice;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {

    public void StringArray(){

       /* String List1 = "Florida";
        String List2 = "California";
        String List3 = "Georgia";
        String List4 = "Texas";  */

        //System.out.println(List2);

        String[] myList = {"Florida", "California", "Georgia", "Texas"};
        //System.out.println(myList[1]);

        for(int i = 0; i<myList.length; i++){
            System.out.println("State name is: " + myList[i]);
        }


    }

    // Sort Array
public void sortArrayInDescendingOrder(){

    String[] states = {"Florida", "California", "Georgia", "Texas"};
    //Arrays.sort(states);
    Arrays.sort(states, Collections.reverseOrder());
    System.out.println(Arrays.toString(states));

}
}
