package mypackage;

import javax.sound.midi.Soundbank;

public class if_else {
    public static void main(String[] args) {
        int i = 7;
        System.out.println("Start of program");

        if (i > 10){
            System.out.println("i > 5");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5) {
            System.out.println("i < 10 and i > 5 ");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }

        System.out.println("End");


        System.out.println();
        System.out.println("Start new program");
        i = 60;

        if (i > 50){
            System.out.println("i > 50");
            if (i > 90){
                System.out.println("i > 90");
            }
            else {
                System.out.println("i <= 90");
            }
        }
        else {
            System.out.println("i <= 50");
        }

        System.out.println("End");

        System.out.println();
        System.out.println("Switch");

        i = 32;

        switch (i){
            case 1:
                System.out.println("The number "+i);
                break;
            case 2:
                System.out.println("The number "+i);
                break;
            case 3:
                System.out.println("The number "+i);
                break;
            default:
                System.out.println("No any numbers!");

        }


    }
}
