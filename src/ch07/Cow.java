package ch07;

public class Cow extends Animal {
    @Override
    public void  crying(){
        System.out.println("소ㅡㄴ음머 ~~");
    }

    @Override
    public void eat() {
        System.out.println("소는 어그적 어그적 먹는다.");
    }
}
