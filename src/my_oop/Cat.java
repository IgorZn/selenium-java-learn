package my_oop;

public class Cat extends animal {

    public void feed(String feed){
        System.out.println("Im like eating "+feed);
        var = 100;
    /*
    К voo нет доступа из дочерних классов
    т.к. эта пере-я имеет статус private
      */
//        voo = 232;
        goo = 23423;
    }

}
