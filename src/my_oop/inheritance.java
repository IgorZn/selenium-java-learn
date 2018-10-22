package my_oop;

public class inheritance {
    public static void main(String[] args) {
        Cat cat =  new Cat();
        Dog dog = new Dog();

        cat.name = "Kuzya";
        dog.name = "Tillusha";

        cat.color = "white";
        dog.color = "black";

        cat.walk("backyard");
        dog.walk("park");

        cat.feed("milk");
        dog.sit();

        System.out.println("Dog name is: "+dog.name);
        System.out.println("Cat name is: "+cat.name);

    }
}
