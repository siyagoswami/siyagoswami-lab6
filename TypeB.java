import java.util.Random;

public class TypeB extends Thing {
    public TypeB() {
        row = 55; 
        col = 50; 
        lab = 'b'; 
    }

    @Override 
    public void maybeTurn(Random rand) { 
        int i = rand.nextInt(3);
        timeSinceLast++;

        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            if (i == 1) {
                rightTurn();
            }

            if (i == 2) {
                leftTurn();
            }
        }
    }
}