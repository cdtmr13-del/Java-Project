import java.util.Random;

public class Critter {
    private String type;
    private String symbol;
    private int strength;

    public Critter(String type, String symbol, int strength) {
        this.type = type;
        this.symbol = symbol;
        this.strength = strength;
    }
        public Critter fight(Critter other, Random rand) {
            int myScore = strength + rand.nextInt(6);
            int otherScore = other.strength + rand.nextInt(6);
            if (myScore >= otherScore){
                return this;
            } else {
                return other;
            }
            
            
            
        }

    public String getSymbol() { return symbol; }
    public String getType() { return type; }
    
    
    

    

    
    
    
}
