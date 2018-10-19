package mypackage;

public class New_CAR {
    public static void main(String[] args) {
        Classes_Objects Car1 = new Classes_Objects();
        Car1.weight = 2000;
        Car1.color = "Green";
        Car1.length = 5000;
        Car1.height = 2000;
        Car1.width = 2000;

        Car1.addWeight(20);
        Car1.drive(300);

        Car1.addWeight(20);
        Car1.drive(300);

        Classes_Objects Car2 = new Classes_Objects("hooooo");
        System.out.println(Car2.color);

        Classes_Objects Car3 = new Classes_Objects("White", 200, 100);
        System.out.println(Car3.color);
        System.out.println(Car3.color+", "+Car3.weight+", "+Car3.length);
    }
}
