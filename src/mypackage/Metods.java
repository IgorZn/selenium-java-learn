package mypackage;

import javax.sound.midi.Soundbank;

public class Metods {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int sum;

        sum = getSum(a,b);
         System.out.println(sum);
         sum = getSum(32342,32423);
         System.out.println(sum);

         showSum(13221,23212,43423);
         saySmth();
        sayHello("Igor");
        showSumToPerson("Vasya",3,5,6);
    }

    static int getSum(int x, int y){
        int sum;
        sum = x * y;
        return sum;
    }

    static void showSum(int x, int y, int z){
        int sum = x * y + z;
        System.out.println("Show sum is: "+sum);
    }

    static void saySmth(){
        System.out.println();
        System.out.println("First string");
        System.out.println("Second string");
        System.out.println("Third string");
    }

    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
    }

    static void showSumToPerson(String name, int a, int b, int c){
        String nameOfMethod = new Object(){}.getClass().getName();
        System.out.println();
        System.out.println("Start of "+nameOfMethod+".");
        sayHello(name);
        showSum(a,b,c);
        System.out.println();
        System.out.println("End of programm.");
    }
}
