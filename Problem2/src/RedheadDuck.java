public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    public void display() {
        System.out.println("I'm a Redhead Duck");
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
