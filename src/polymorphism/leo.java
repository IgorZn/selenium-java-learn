package polymorphism;

public class leo extends animal_p {
    int weight;

    public void sit(){
        System.out.println("Im sitting");
    }

    public void lay(){
        System.out.println("Im laying");
    }

    /*
    @Override указывает, что далее мы собираемся переопределять метод базового класса.
    */
    @Override
    public void sound(){
        System.out.println("Hello my name is НННН");

    }
}
