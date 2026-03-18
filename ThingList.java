import java.util.Random;

public class ThingList {
    private class Node {
        Thing data;
        Node next;
    }

    private Node head; 

    public void addThing(Thing t) {
        Node n = new Node(); 
        n.data = t; 
        n.next = head; 
        head = n; 
    }

    public void printAll() {
        for( Node T = head; T != null; T = T.next )
            System.out.println(T.data.toString());
    }
    

    public void moveAll(Random rand) {
        for( Node T = head; T != null; T = T.next ) {
            T.data.maybeTurn(rand);
            T.data.step();
        }
    }
}