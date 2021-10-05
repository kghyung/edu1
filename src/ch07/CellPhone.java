package other;
//부모 클래스
public class CellPhone {
    String model;
    String color;

    void  powerOn(){
        System.out.println("전원을 켭니다.");
    }

    void  powerOff(){
        System.out.println("전원을 끕니다.");
    }

    void  powerInfo(){
        System.out.printf("model : %s, color : %s\n", model, color);
    }

    void sendMsg(String msg){
        System.out.print("보낸 메세지 : " + msg);
    }

}
