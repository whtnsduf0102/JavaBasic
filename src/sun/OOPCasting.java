package sun;
/*
* 클래스/인터페이스 형변환
* 특정객체가 자식클래스/ 인터페이스 타입에서
* 부모클래스/인터페이스 타입 또는 반대로 형 변환 하는 것을 의미*/
public class OOPCasting {
    public static void main(String[] args) {
        Unit u1 = new Unit();
        Marine m1 = new Marine();
        Firebat f1 = new Firebat();
        u1.attack();
        m1.attack();
        f1.attack();

        Unit unit = new Marine();
/*마린객체는 자동으로 유닛 객체로 형변환
* 이처럼 상속관계에 있는 클래스간의 객체 생성시
* 자식 클래스 타입의 객체를 부모클래스 타입의 객체로
* 선언하는 경우 업캐스팅 upcasting 라고 함*/

        //m2.attack();

     //   Firebat f2 = (Firebat) new Unit();
        /*유닛 객체를 파이어뱃 객체로 형변환 하려면
        * 명시적 형변환 필요
        * 이처럼 상속관계에 있는 클래스간의 객체생성시
        * 부모클래스타입의 객체를 자식클래스타입의 객체로
        * 선언하는 경우 다운캐스팅 downcasting 이라고 함.
        * 단, 컴파일시에는 오류가 나지 않지만
        * 실행시 오류 발생! */
     //   f2.attack();
        Marine m3= (Marine)unit;
        /*유닛 객체변수를 마린 객체로 다운캐스팅
        * 실행에는 아무문제없음
        * =>유닛변수는 마린 객체를 유닛객체로 만든것
        * 따라서, 마린객체로의 형변환이 가능*/
        m3.attack();


    }
}
class Unit{
    protected int hp;
    protected int ap;

    public void attack(){
        System.out.println("공격중입니다.");
    }
}

class Marine extends Unit{
    @Override
    public void attack() {
        System.out.println("해병대가 공격중");
    }
}
class Firebat extends Unit{
    @Override
    public void attack() {
        System.out.println("불곰이 공격중");
           }
}
