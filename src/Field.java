import java.util.Random;

public class Field {

    /* Field parameters */
    //private final static int NBMINES = 3;
    private final int nbMinesToPlace; // Number of mines to place on the minefield
    private final static int nbMines[] = {3 ,7 ,10, 15}; // Possible mines of the minefield depending on level difficulty
    private final static int DIM = 5;       // Dimension of the minefield
    private final static int dimParam[] = {5 ,7 ,9, 12};  // Possible dimensions of the minefield depending on level difficulty
    private final int dimParameter;

    private boolean [][] field; // Minefield
    private int nbMinesPlaced = 0;
    Random alea = new Random();
    private Levels level;
    Field(){
        this.dimParameter = 5;
        this.nbMinesToPlace = 3;
    }
    Field(Levels level) {        // Default constructor for field
        nbMinesToPlace = nbMines[level.ordinal()];
        dimParameter = dimParam[level.ordinal()];
    }

    /* Field methods */
    public void initField() {      // Place the mine in the field
        this.field = new boolean[dimParameter][dimParameter];
        while(nbMinesPlaced < nbMinesToPlace){     // Check if there is enough available places to place a mine
            int x = alea.nextInt(dimParameter);  // Random generation of place (x,y) on the field
            int y = alea.nextInt(dimParameter);
            if(!this.field[x][y]){      // Check if the position is not currently occupied
                this.field[x][y] = true;
                nbMinesPlaced++;        // increments the number of placed mines
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

    /* Level methods */





}