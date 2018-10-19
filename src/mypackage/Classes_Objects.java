package mypackage;

public class Classes_Objects {
    public Classes_Objects(){
        System.out.println("New Car created!");
    }

    public Classes_Objects(String color){
        this.color = color;
    }

    public Classes_Objects(String color, int weight, int length){
        this.color = color;
        this.weight = weight;
        this.length = length;
    }

    int height;
    int width;
    int length;
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
