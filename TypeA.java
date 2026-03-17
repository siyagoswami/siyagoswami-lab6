public class TypeA extends Thing {
    public TypeA() {
        row = 45; 
        col = 50; 
        lab = 'r'; 
    }

    @Override 
    public void maybeTurn() { 
        int i = rand.nextInt(3); 
        if (i == 1) {
            rightTurn(t);
        }

        if (i == 2) {
            leftTurn(t);
        }
    }
}