import java.util.*;
public class CollectionFrameworkLL{
    public static void main(String args[]){
        LinkedList<String> List = new LinkedList<String>();

        List.addFirst("a");
        List.addFirst("is");
        System.out.println(List);

        List.addLast("This");
        System.out.println(List);

        // to get the list
        for(int i = 0; i<List.size();i++){
            System.out.print(List.get(i) + "->");
        }
        System.out.print("NULL");

        List.removeFirst();
        System.out.println(List);

        List.removeLast();
        System.out.println(List);

        List.remove(2);
        System.out.println(List);
    }
}