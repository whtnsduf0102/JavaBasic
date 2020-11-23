package sun;
/*인터페이스
* 추상메서드와 상수만으로 구성되는 특수한 클래스
* 어떤 클래스를 만들때 추상메서드를 통해
* 기본이 되는 틀을 제공하여 규칙에 맞춰 코드를 짤 수 있게 해 줌
*  => 접근제한자는 public 으로 고정
* 클래스와는 달리 다중상속을 지원함
*
* 인터페이스 작성시 interface 를 사용
* 인터페이스를 구현할때 implements를 사용 */
public class Interface {
    public static void main(String[] args) {
        Cat3 c3 = new Cat3();
        Dog3 d3 = new Dog3();
        System.out.println(c3.cry());
        System.out.println(d3.cry());
    }
}

class Animal3{
    protected int weight;
    protected int height;
}
interface Animal3Action{
    public static String COLOR = "brown";
    //static String COLOR = "brown";
    //String COLOR = "brown";

    //public abstract  String cry();
    //abstract  String cry();
    String cry();
}
class Cat3 extends Animal3 implements Animal3Action {//빨간줄 alt + enter

    @Override
    public String cry() {
        return "야옹 야옹";
    }
}
    class Dog3 extends Animal3 implements Animal3Action{

        @Override
        public String cry() {
            return " 멍멍";
        }
    }
    class Murloc extends Animal3 implements Animal3Action{

        @Override
        public String cry() {
            return "아훓훓훓~";
        }
    }
