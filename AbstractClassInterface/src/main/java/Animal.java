public abstract class Animal {
    String name;

    abstract void makeSound(); // абстрактный метод

    void display() { // метод с реализацией
        System.out.println("Я " + name);
    }
}
