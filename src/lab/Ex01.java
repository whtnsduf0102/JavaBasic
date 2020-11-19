package lab;

public class Ex01 {

    public static void main(String[] args) {
        /*학생 클래스를 이용해서 객체생성
        * 학과 클래스를 이용해서 객체 생성
        * 과목 클래스를 이용해서 객체 생성
        * 교수 클래스를 이용해서 객체 생성
        *
        * 각 객체에 변수에 값대입
        *
        * 객체에 저장된 값 출력*/
        //학생
        Student kim = new Student();
        Student song = new Student();
        Student jean = new Student();
        Student su = new Student();
        Student iu = new Student();

        //학과
        Major computer = new Major();
        Major dress = new Major();
        Major food = new Major();
        Major philosophy = new Major();

        //과목
        Subject programing = new Subject();
        Subject dresscode = new Subject();
        Subject life = new Subject();
        Subject devil = new Subject();

        //교수
        Professor leesunsin = new Professor();
        Professor jung = new Professor();
        Professor kimyusin = new Professor();
        Professor leesungge = new Professor();

        //객체의 변수(맴버변수)에 값 대입
        //학생
        kim.number =201350050;
        kim.name="김태희";
        kim.address="경기도 고양시";
        kim.birth="1985.3.22";
        kim.major="컴퓨터";
        kim.professor=504;

        song.number =201250006;
        song.name="송혜교";
        song.address="서울 영등포구";
        song.birth="1988.9.17";
        song.major="컴퓨터";
        song.professor=301;

        jean.number =201252110;
        jean.name="전지현";
        jean.address="경기도 의정부시";
        jean.birth="1986.4.30";
        jean.major="의상디자인";
        jean.professor=445;

        su.number =201351010;
        su.name="수지";
        su.address="서울 성북구";
        su.birth="1988.7.13";
        su.major="식품영양";
        su.professor=556;

        iu.number =201353011;
        iu.name="아이유";
        iu.address="경기도천안시";
        iu.birth="1987.2.25";
        iu.major="철학";
        iu.professor=504;


        //학과


    }
}
