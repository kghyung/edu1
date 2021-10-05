package ch07;

public class Dog extends Animal{
    @Override
    public void crying(){
        System.out.println("강아지가 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("소는 어그적 어그적 먹는다.");
    }
}
