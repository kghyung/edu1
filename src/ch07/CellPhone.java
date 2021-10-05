package ch07;

import javafx.scene.control.Cell;

//부모 클래스
public class CellPhone extends Object {
    String model;
    String color;

    public CellPhone()
    {
        this("노트10", "white");
    }

    public CellPhone(String model, String color)
    {
        this.model = model;
        this.color = color;
    }

    void  powerOn(){
        System.out.println("전원을 켭니다.");
    }

    void  powerOff(){
        System.out.println("전원을 끕니다.");
    }

    void  powerInfo(){
        System.out.printf("model : %s, color : %s\n", model, color);
    }

    void  printInfo(){
        System.out.printf("model : %s, color : %s, \n"
                ,model, color);
    }

    void sendMsg(String msg){
        System.out.print("보낸 메세지 : " + msg);
    }

}

/*다형성 (여러가지 형태가 있는 성질)
*
* 1. 부모타입은 자식객체 주소값 저장할 수 있다. (가리킬 수 있다)
* 2. 자식타입은 부모객체 주소값 저장할 수 없다. (가리킬 수 없다.) 컴파일러 발생
* 3. 메소드 호출은 타입이 알고 있는 것만 호출 할 수 있고, 내용은 객체 기준이다.
* */