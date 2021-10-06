package ch07;
/*다형성 (여러가지 형태가 있는 성질)
 *
 * 1. 부모타입은 자식객체 주소값 저장할 수 있다. (가리킬 수 있다)
 * 2. 자식타입은 부모객체 주소값 저장할 수 없다. (가리킬 수 없다.)
 * 3. 메소드 호출은 타입이 알고 있는 것만 호출 할 수 있고, 내용은 객체 기준이다.
*/
public class AnimalTest {
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();
        Cat cat = new BigCat();
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
        //Animal animal3 = new Animal();
        //Object obj = new Animal();

        Cat cat2 = new BigCat();
        cat2.crying();

        BigCat bigCat1 = (BigCat) cat2;
        bigCat1.sleep();



    }
}
