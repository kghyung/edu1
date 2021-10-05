package ch07;

public class Cat extends Animal{
    @Override
    public void crying(){
        System.out.println("고양이가 냐~~~농");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 낼름낼름 먹는다.");

    }
}
