public class ThingList {
    private Node head; 

    public void add(Thing t) {
        Node n = new Node(); 
        n.data = t; 
        n.next = head; 
        head = n; 
    }

    public void printAll() {
        for( Node T = L; T != null; T = T.next )
            System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
    }
    

    public void moveAll() {
        for( Node T = L; T != null; T = T.next ) {
            maybeTurn(T.data);
            step(T.data);
        }
    }
}