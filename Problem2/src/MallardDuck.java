public class MallardDuck extends Duck{

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }
   @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
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
