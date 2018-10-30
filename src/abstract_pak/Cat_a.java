package abstract_pak;

public class Cat_a extends Animal_a{
    @Override
    public void saySmth() {
        System.out.println("Meaw, Im fucking cat!");
    }

    @Override
    public void saySmthNew() {
        System.out.println("I like it!");
    }

    public void giveMeHand(String word){
        System.out.println("I can give you a hand, but ask me!" + word);
    }
}
