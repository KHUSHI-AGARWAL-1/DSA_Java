import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist_java {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(0);
        list.add(0,17);
        list.add(1,23);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.removeLast());
        System.out.println(list);
        Queue<Integer> q = new LinkedList<>(); //properties sari linkedlist ki inherit hogi
    }
}
