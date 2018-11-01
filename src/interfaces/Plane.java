package interfaces;

public class Plane implements Transport{
    @Override
    public void go() {
        System.out.println("We're flying!");
    }

    @Override
    public void stop() {
        System.out.println("We're dieing!");
    }

    public void setSpeed(int speed){
        System.out.println("Our speed is: "+speed);
    }
}
