package mypackage;

public class TestClass {
    public static void main(String[] args) {
        byte a = 5; // -128 127
        short b = -100; // -32768 32767
        int c = 1000000; //
        long d = -123456789;

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        double double1 = 122.33;
        float fl1 = 188.55f;
        System.out.println("\ndouble double1: " + double1);
        System.out.println("float fl1: " + fl1);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("\nboolean bool1: " + bool1);
        System.out.println("boolean bool2: " + bool2);

        boolean bool3 = 1 + 2 > 0;
        boolean bool4 = 1 + 2 > 5;

        System.out.println(bool3);
        System.out.println(bool4);

        String str1 = "Hello ";
        String str2 = "world!";
        String str3 = str1 + str2;

        System.out.println("\n" + str3);

        char char1 = 'q';
        System.out.println("\n"+char1);





    }
}
