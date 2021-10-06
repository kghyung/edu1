package ch07;

public interface RemoteControl {
    public static final int MAX_VOLUME = 10; //인터페이스는 static 상수만 만들 수 있음.
    int MIN_VOLUME = 0;

    public abstract void turnOn();  //자동으로 추상메소드가 된다.
    public void turnOff();
    abstract void volumeUP();
    void volumeDown();
//똑같음
}
