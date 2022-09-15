import java.util.Random;

public class Field {
    final static int NBMINES = 10;       // Number of mines to place
    final static int DIM = 5;       // Dimension of the mine field
    private int dim;
    Random alea = new Random();

    private boolean [][] field; // Mine field

    public Field() {        // Default constructor for field
        this.field = new boolean[DIM][DIM];
    }

    public Field(int dim) {     // Init connstructor for field
        this.field = new boolean[dim][dim];
    }
    private int nbMinesPlacee = 0;
    public void initField() {      // Place the mine in the field
        while(nbMinesPlacee < NBMINES){     // Check if there is enough available places to place a mine
            int x = alea.nextInt(DIM);  // Random generation of place (x,y) on the field
            int y = alea.nextInt(DIM);
            if(this.field[x][y] == false){      // Check if the position is not currently occupied
                this.field[x][y] = true;
                nbMinesPlacee++;        // increments the number of placed mines
            }
        }
    }

    public void display() {     // Display the entire field of mine
        for (int x =0; x < field.length;x++){
            for(int y = 0; y < field[0].length;y++){    // For loop on the matrix to display all objects
                if (field[x][y])
                    System.out.print('x'); // Display a mine if true
                else
                    System.out.print('o'); // Display an empty case
            }
            System.out.println(); // Skips a line
        }
    }
}