public class TypeC extends Thing { 
    private boolean turnLeft = true; 

    public TypeC() {
        row = 50; 
        col = 50; 
        lab = 'g'; 
    }

    @Override 
    public void maybeTurn() {
        if(turnLeft) {
            leftTurn(); 
        } else {
            rightTurn(); 
        }

        turnLeft = !turnLeft;
    }
}