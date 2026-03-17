public class Thing { 
    public static Random rand = new Random(System.currentTimeMillis());
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';

    public void rightTurn(Thing t) {
        t.dir = (t.dir + 1) % 4;
    }

    public static void leftTurn(Thing t) {
        t.dir = (t.dir + 3) % 4;
    }

    public static void maybeTurn(Thing t) {
        // will be overridden 
    }

    public static void step(Thing t) {
        final int[] dc = {
            0, 1, 0, -1
        }, dr = {
            1, 0, -1, 0
        };
        
        t.row += dr[t.dir];
        t.col += dc[t.dir];
    }

    public String toString() {
        return row + " " + col + " " + lab; 
    }
}