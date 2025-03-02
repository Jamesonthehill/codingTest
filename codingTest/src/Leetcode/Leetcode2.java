import java.util.ArrayList;

class Leetcode2 {
    public static void main(String[] args){

        System.out.println("========== start program");

        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        int i = 0;

        while ( i < list.size()){
            
            if (  list.get(i) == 2 ){
                System.out.println(list);
            } else if ( list.get(i) == 4) {
                System.out.println(list);
            } else {
                System.out.println("there is no answer");
            }
            i++;
        }
    

    }
}