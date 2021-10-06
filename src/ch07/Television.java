package ch07;

public class Television implements RemoteControl  {     //인터페이스는 implements 사용
    private  int volume;


    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void volumeUP() {
        if(volume < MAX_VOLUME){
            volume++;
        }

    }

    @Override
    public void volumeDown() {
        if(volume > MIN_VOLUME){
            volume--;
        }

    }

    public void volumeState(){
        System.out.println("volume : " + volume);
    }
}
