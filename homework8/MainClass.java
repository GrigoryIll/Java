package homework8;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10, false);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate, cat);
        cat.info();
    }
}