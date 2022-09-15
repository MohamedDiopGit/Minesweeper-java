public class Main {
    private final Field field;
    Main(){
        field = new Field(Levels.CUSTOM);
        field.initField();
        field.display();
    }

    public static void main(String[] args) {
        new Main();
    }
}