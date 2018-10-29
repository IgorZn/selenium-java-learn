package polymorphism;

public class animal_p {
    String name;
    String color;

    public int var;     /* можно использовать где угодно */
    private int voo;    /* можно использовать только внутри данного класса */
    protected int goo;  /* доступен не только внутри самого класса, но и внутри всех классов-наследников */
    int joo;    /* default (package-private) видны внутри пакета */

    public void walk(String place){
        System.out.println("Im walking in "+place);
        var = 10;
    /*  private -   В рамках класса "animal" voo доступна, но не за
    его приделами   */
        voo = 99;
    /*  protected   -   В рамках класса "animal" goo доступна, но не за
    его приделами   */
        goo = 2323;
    }

    public void spleep(String sleep){
        System.out.println("Zzzzzzz");
    }
    public void sound(){
        System.out.println("Hello!");
    }


}

