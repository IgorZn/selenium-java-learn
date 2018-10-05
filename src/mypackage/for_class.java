package mypackage;

public class for_class {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            System.out.println(i * 9);
        }

        System.out.println("i--, i = 10");
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("Fill arr");

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i * 2;
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Index: "+i+" arr is:"+arr[i]);
        }

        System.out.println();
        for (int element: arr){
            System.out.println(element);
        }

        System.out.println();
        int i = 0;
        boolean boo = true;
        while (boo){
            System.out.println("while: "+i);
            i++;
            if (i == 5) boo = false;
        }

        i = 10;
        do{
            System.out.println("Do: "+i);
            i++;
        } while (i < 5);
    }
}
