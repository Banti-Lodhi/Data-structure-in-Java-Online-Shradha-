import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(1);
        System.out.println(list);

        //Get element
        int element = list.get(3);
        System.out.println(element);


        //add element in between
        list.add(2,6);
        System.out.println(list);

        //set element in between
        list.set(4,6);
        System.out.println(list);

        //delete element from an index
        list.remove(3);
        System.out.println(list);

        //size of the list

        int size = list.size();
        System.out.println(size);

        //loop on list
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " " );
        }
        System.out.println();
    
    // sorting the list
    list.add(0);
    Collections.sort(list);
    System.out.println(list);
   }
}
