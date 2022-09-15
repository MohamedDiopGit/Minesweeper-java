import java.util.Random;

public class Main {
    private static final int MAX = 10;

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Random gene = new Random() ;
        int nbAlea = gene.nextInt(MAX);
        System.out.println("nbAlea: " + nbAlea);
    }
}