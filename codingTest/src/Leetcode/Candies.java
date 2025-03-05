import java.util.ArrayList;
import java.util.Arrays;

public class Candies  {
    public static void main (String[] args) throws NullPointerException {

        System.out.println("========== Start program");
            
            ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,5,1,3));
            ArrayList<Boolean> list2 = new ArrayList<>();
            int pastResult = 0;

            System.out.println(list);
            
        for ( int i = 0;  i < list.size(); i++ ){

            int R = 3;
            int J = list.get(i) + R;
            
            if ( (pastResult > J  ) ) {
                list2.add(true);
            } else {
                list2.add(false);
            }
            pastResult = list.get(i); // this part, you can take the result of prior one.
        }       
        System.out.println(list2);
    }
}
