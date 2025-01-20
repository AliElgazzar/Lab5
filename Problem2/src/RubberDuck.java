public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new CannotFly(), new Quack());
    }
    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
    @Override
    public void fly() {
        CannotFly cf = new CannotFly();
        cf.fly();
    }
    @Override
    public void quack() {
        Quack mq = new Quack();
        mq.quack();
    }
}
