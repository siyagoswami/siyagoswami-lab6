import java.util.Random;

public class TypeA extends Thing {
    public TypeA() {
        row = 45; 
        col = 50; 
        lab = 'r'; 
    }

    @Override 
    public void maybeTurn(Random rand) { 
        int i = rand.nextInt(3); 
        if (i == 1) {
            rightTurn();
        }

        if (i == 2) {
            leftTurn();
        }
    }
}