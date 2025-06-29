import java.util.*;
class ArrayLists{
    public static void main(String args[]){
    // Declare the arraylist
    ArrayList<Integer> list = new ArrayList<Integer>();
    // ArrayList<Float> list = new ArrayList<Float>();
    // ArrayList<Boolean> list = new ArrayList<Boolean>();

    // Add the elements
    list.add(0);
    list.add(2);
    list.add(4);

    System.out.println(list);

    // get the elements
    int element = list.get(0);
    System.out.println(element);

    // add element in between the arraylist
    list.add(1,1);
    System.out.println(list);

    // set the element 
    list.set(1,8);
    System.out.println(list);

    // to delete the element
    list.remove(3);
    System.out.println(list);

    // to get the size of the element
    int size = list.size();
    System.out.println(size);

    // to sort the list
    Collections.sort(list);
    System.out.println(list);
    }
}