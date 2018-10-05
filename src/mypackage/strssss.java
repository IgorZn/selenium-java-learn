package mypackage;

public class strssss {
    public static void main(String[] args) {
        String sss = "Hello World!";
        System.out.println(sss.equals("Hello World!"));
        System.out.println(sss.equals("Hello"));

        String sss2 = "Hello";
        System.out.println(sss.equals(sss2));

        String s = "text";
        String s2 = "TEXT";

        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.equals(s2));

        s = "tExT";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(2));
        System.out.println(s.toLowerCase().indexOf('e'));

        s = "Hello, World!";
        System.out.println();
        System.out.println(s.contains("Hello"));
        System.out.println(s.length());

        System.out.println();
        System.out.println(s.startsWith("He"));
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("!"));
        System.out.println(s.endsWith("He   "));

        s = "hello,world";
        System.out.println();
        System.out.println();
        String[] array = s.split(",");
        System.out.println(array[0] + "! " + array[1] + "!");
        System.out.println(array[0] + array[1]);

        String str = "My name is %s! I'm %d years old.";
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Valera", 8));

        String age2 = "25";
        int a = Integer.parseInt(age2);
        System.out.println(a * 30);

        s = "Hello, Gandon!";

        System.out.println();
        System.out.println(s.substring(7,10));
        System.out.println(s.substring(7));
        System.out.println(s.substring(7, s.length()-2));

        String st1 = "Hello ";
        String st2 = "world";
        String st3 = "!";

        String res = st1 + st2 + st3;
        System.out.println();
        System.out.println(res);

        res = st1.concat(st2).concat(st3);
        System.out.println(res);


    }
}
