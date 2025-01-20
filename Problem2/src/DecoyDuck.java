public class DecoyDuck extends Duck {

    public DecoyDuck() {
     super(new CannotFly() , new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck");
    }

    @Override
    public void fly() {
        CannotFly cf = new CannotFly();
        cf.fly();
    }
    @Override
    public void quack() {
        MuteQuack mq = new MuteQuack();
        mq.quack();
    }

}