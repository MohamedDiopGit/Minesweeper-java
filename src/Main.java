public class Main {
    private static final int MAX = 10;
    private Field field;
    Main(){
        field = new Field();
        field.initField();
        field.display();
    }

    public static void main(String[] args) {
        new Main();
    }
}