package my_oop;

public class Dog extends animal {

    private int weight = 2;

    /* Геттер - это метод возвращающий (return) значение некоего свойства класса*/
    public int getWeight() {
        return weight;
    }

    /* сеттер - то что устанавливает (this.weight = weight) свойство класса */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sit(){
        System.out.println("Im sitting");
    }

    public void lay(){
        System.out.println("Im laying");
    }
}
