package interfaces;

public class Car implements Transport, NewInterface {
    @Override
    public void go() {
        System.out.println("We're drive!");
    }

    @Override
    public void stop() {
        System.out.println("We are driving fast!");
    }

    @Override
    public void met1() {
        System.out.println("This is met1 from NewInterface");
    }

    @Override
    public void met2() {
        System.out.println("This is met2 from NewInterface");
    }
}
