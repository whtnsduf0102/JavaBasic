package sun;

/*메서드 재정의 Override
* 객체지향 중요 3대개념중 다형성에 해당
* 상송관계에 있는 상위클래스의 메서드를
* 하위클래스에서 같은 이름의 메서드로 다시 작성하는 것을 의미
* 즉, 상속받은 메서드를 새로 정의해서 사용하는 것을 말함*/
public class Overriding {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Animal a = new Animal(); //부모클래스 객체화

        System.out.println(c.cry());
        System.out.println(d.cry());
        System.out.println(a.cry());
    }
}
class Animal {
    protected String cry(){return "동물이 웁니다.";}
}
class Cat extends Animal {
    @Override
    protected String cry() { return "야옹~야옹~"; }
}
class Dog extends Animal{
    @Override
    protected String cry() { return "멍!멍!"; }
}