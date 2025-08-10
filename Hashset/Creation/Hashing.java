import java.util.*;
public class Hashing{
    public static void main(String args[]){
        // main function
        // creation
        HashSet<Integer> set = new HashSet<>();
        // insert the elements
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        // search the elements
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }

        // delete the elements
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contains 1");
        }

        // to get the size of the set
        System.out.println("this is the size of the set :" +set.size());

        // to get the all elements of the HashSet
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        // two functions:- hasNext and next;

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}