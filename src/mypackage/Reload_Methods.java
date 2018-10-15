package mypackage;

import java.util.Objects;

public class Reload_Methods {
    public static void main(String[] args) {
        System.out.println(getSum(10, 22));
        sayHello("Igor");
        sayHello("Dima", "Vasya");
        sayHello();
        System.out.println(getSum(12,33,"1"));
    }

    static int getSum(int x, int y){
        int sum;
        sum = x + y;
        return sum;
    }

    static int getSum(int x, int y, String foo){
        int sum;
        if(Objects.equals(foo, null)){
            System.out.println("Null");
        }else {
            System.out.println(foo);
        }
        sum = x + y;
        return sum;
    }

    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello, "+name+"!");
    }

    static void sayHello(String name1, String name2){
        System.out.println();
        System.out.println("Hello, "+name1+"!");
        System.out.println("Hello, "+name2+"!");
    }
    static void sayHello(){
        System.out.println();
        System.out.println("Hello!");
    }
}
