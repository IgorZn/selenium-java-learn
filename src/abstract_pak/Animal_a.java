package abstract_pak;
/*
* Кроме обычных классов в Java есть абстрактные классы. Абстрактный класс похож на обычный класс.
* В абстрактном классе также можно определить поля и методы, в то же время нельзя создать объект
* или экземпляр абстрактного класса. Абстрактные классы призваны предоставлять базовый функционал
* для классов-наследников. А производные классы уже реализуют этот функционал.
*
* При определении абстрактных классов используется ключевое слово abstract
* */

public abstract class Animal_a {

    public abstract void saySmth();
    public abstract void saySmthNew();

    public void saySmthNew(String place){
        System.out.println("Im walking on the "+place);
    };
}
