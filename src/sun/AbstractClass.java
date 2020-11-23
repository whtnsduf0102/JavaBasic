package sun;

/*추상클래스
* 추상메서드를 포함하는 클래스
* 추상메서드  : 메서드의 선언부만 있고 몸체가 없는 메서드
* 메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함
*
* 따라서, 추상클래스는 불완전 클래스이므로
* 객체화 할 수 없음
* 추상메서드나 추상클래스는 abstract라는 키워드 사용*/

public class AbstractClass {
    public static void main(String[] args) {
        //Animal2 a1 = new Animal2() {}
        Cat2 c2 = new Cat2();
        Dog2 d2 = new Dog2();

        System.out.println(c2.cry());
        System.out.println(d2.cry());
    }
}

abstract class Animal2{
    protected int weight;
    abstract String cry();  //추상메서드(=불완전메서드)
}
class Cat2 extends Animal2{
    @Override
    String cry() { return "야옹야옹"; }
}
class Dog2 extends Animal2{
    @Override
    String cry() {
        return "멍멍";
    }
}