package mypackage;

public class Arrays {
    public static void main(String[] args) {
        String[] names;
        names = new String[3];

        String[] name = new String[3];
        int[] arr = new int[10];

        name[0] = "Vasiya";
        name[1] = "Petya";
        name[2] = "Kolya";

        System.out.println(name[0]);
        System.out.println(name[2]);

        arr[1] = 15;
        arr[3] = 33;

        System.out.println(arr[3]);

        int[] array = {1, 33, 49, 22222, 33333};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }

        System.out.println();

        int[] arr2 = new int[15];
        for (int j = 0; j < 15; j++){
            arr2[j] = j * 10;
            System.out.println(arr2[j]);
        }

        System.out.println();
        System.out.println(arr2.length);

        System.out.println();
        System.out.println(arr2[arr2.length -1]);


    }
}
