package mypackage;

public class Exeptions{
    public static void main(String[] args) {
        devide(10,2);
        try {
            devide(10,2,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void devide(int a, int v){
        try {
            System.out.println("Result is: "+a/v);
        } catch (ArithmeticException e) {
            System.out.println("There's some problem!");
//            e.printStackTrace();
        } finally {
//            Блок 'finally' выполняется всегда в конце
            System.out.println("Finish!");
        }
    }

    public static void devide (int a, int v, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Cannot devide by zero! (IGOR)");
        } else {
            System.out.println("Result is:"+a/v/b);
        }
    }
}
