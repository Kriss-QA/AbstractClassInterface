public class Fish implements Swimmable {

    String name = "Рыбка";
    @Override
    public void swim() {
        System.out.println(name + " плавает со скоростью " + (MAX_SPEED + MIN_SPEED)/2 + " км/ч");
    }
}
