import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
public class Ecosystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int size = 5;
        
        Critter [][] world = new Critter[size][size];
        
        world[0][0] = new Critter("Rabbit", "R", 2);
        world[3][2] = new Critter("Wolf", "W", 8);
        world[4][1] = new Critter("Fox", "F", 5);

               
        System.out.println("W = Wolf | F = Fox | R = Rabbit ");


        System.out.print("How many cycles to run? ");
        int cycles = input.nextInt();

        for (int c = 1; c <= cycles; c++) {
            System.out.println("\n--- Cycle " + c + " ---");
    
            Critter[][] newWorld = new Critter[size][size];
            
            for (int row = 0; row < size; row++ ){
                for (int col = 0; col < size; col++){
                    if (world[row][col] != null){
                        Critter current = world[row][col];
                        
                        int newRow = row + rand.nextInt(3) - 1;
                        int newCol = col + rand.nextInt(3) - 1;
                        
                        if (newRow < 0) newRow = 0;
                        if (newRow >= size) newRow = size -1;
                        if (newCol < 0) newCol = 0;
                        if (newCol >= size) newCol = size -1;
                        
                        if (newWorld[newRow][newCol] == null) {
                            newWorld[newRow][newCol] = current;
                        }else {
                            Critter other = newWorld[newRow][newCol];
                            Critter winner = current.fight(other, rand);
                            newWorld[newRow][newCol] = winner;
                            
                            System.out.println(current.getType() + " fought " + other.getType()+ ". Winner: "+ winner.getType());
                        }
                    }
                }
            }
            
            world = newWorld;
            
            for (int row = 0; row < size; row++ ){
                for (int col = 0; col < size; col++ ){
                    if (world[row][col] == null) {
                        System.out.print(". ");
                    }else {
                        System.out.print(world[row][col].getSymbol() + " ");
                    }
                }
                
                System.out.println();
            }
        }
        input.close();
    }
}
