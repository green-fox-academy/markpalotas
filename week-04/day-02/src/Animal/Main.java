package Animal;

public class Main {
    public static void main(String[] args) {
        Animal giraffe = new Animal("giraffe");
        Animal lion = new Animal("lion");
        Animal scrat = new Animal("scrat");
        giraffe.eat();
        lion.drink();
        scrat.play();
        lion.play();
        giraffe.play();
    }
}
