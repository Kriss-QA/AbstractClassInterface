public class Duck extends Animal implements Swimmable {

    String name = "Уточка";
    @Override
    void makeSound() {
        System.out.println("Кря-кря!");
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает");
    }
}
