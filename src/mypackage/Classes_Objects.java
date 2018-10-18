package mypackage;

import javax.sound.midi.Soundbank;
import java.util.logging.SocketHandler;

public class Classes_Objects {
    int height;
    int width;
    int lenght;
    int weight;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight){
        this.weight += weight;
        System.out.println("New weight: "+this.weight);
    }

    public void drive(int speed){
        if (weight <= maxWeight & speed <= maxSpeed) {
            this.speed = speed;
            System.out.println("We are driving!");
            System.out.println(speed);
        } else {
            System.out.println("Cannot drive!");
            if (speed > maxSpeed) {
                System.out.println("Speed limit reached! "+speed);
                System.out.println("Max speed is: "+maxSpeed);
            }


        }
    }
}
