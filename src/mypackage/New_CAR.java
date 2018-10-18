package mypackage;

public class New_CAR {
    public static void main(String[] args) {
        Classes_Objects Car1 = new Classes_Objects();
        Car1.weight = 2000;
        Car1.color = "Green";
        Car1.lenght = 5000;
        Car1.height = 2000;
        Car1.width = 2000;

        Car1.addWeight(20);
        Car1.drive(300);

        Car1.addWeight(20);
        Car1.drive(300);
    }
}
