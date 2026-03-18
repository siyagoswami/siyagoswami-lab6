import java.util.Random; 

public class TypeC extends Thing { 
    private boolean turnLeft = true; 

    public TypeC() {
        row = 50; 
        col = 50; 
        lab = 'g'; 
    }

    @Override 
    public void maybeTurn(Random rand) {
        if(turnLeft) {
            leftTurn(); 
        } else {
            rightTurn(); 
        }

        turnLeft = !turnLeft;
    }
}