package polymorphism;

public class run_me{
    public static void main(String[] args) {

        leo my_leo = new leo();
        ant my_ant = new ant();

        /* В данном случае мы получим `Hello` из класса animal_p */
        my_ant.sound();

        /* А тут уже новое, т.к. этот метод был @Override в классе leo */
        my_leo.sound();

    }
}