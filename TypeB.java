public class TypeB extends Thing {
    public TypeB() {
        row = 55; 
        col = 50; 
        lab = 'b'; 
    }

    @Override 
    public void maybeTurn() { 
        int i = rand.nextInt(3);
        t.timeSinceLast++;

        if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;
            if (i == 1) {
                rightTurn(t);
            }

            if (i == 2) {
                leftTurn(t);
            }
        }
    }
}