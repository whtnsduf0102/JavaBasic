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

        //매개변수를 사용하는 생성자로 객체생성
       //학생
        Student std = new Student("전지현","경기도의정부시",
                "1986.4.30","의상디자인",
                "445");
        /*Student song = new Student();
        Student jean = new Student();
        Student su = new Student();
        Student iu = new Student();*/

        //학과
        Major dept = new Major("식품영양", "345-6789-0123",
                "F동 8층", "556");
        /*Major dress = new Major();
        Major food = new Major();
        Major philosophy = new Major();*/

        //과목
        Subject subj = new Subject("5029", "생활의참견",
                "음식의영양", "556.");
       /* Subject dresscode = new Subject();
        Subject life = new Subject();
        Subject devil = new Subject();*/

        //교수
        Professor prof = new Professor("556","김유신",
                "식품영양");
       /* Professor jung = new Professor();
        Professor kimyusin = new Professor();
        Professor leesungge = new Professor();*/

        //객체의 변수(맴버변수)에 값 대입
        //학생
        /*kim.number =201350050;
        kim.name="김태희";
        kim.address="경기도 고양시";
        kim.birth="1985.3.22";
        kim.major="컴퓨터";
        kim.professor="504";

        song.number =201250006;
        song.name="송혜교";
        song.address="서울 영등포구";
        song.birth="1988.9.17";
        song.major="컴퓨터";
        song.professor="301";

        jean.number =201252110;
        jean.name="전지현";
        jean.address="경기도 의정부시";
        jean.birth="1986.4.30";
        jean.major="의상디자인";
        jean.professor="445";

        su.number =201351010;
        su.name="수지";
        su.address="서울 성북구";
        su.birth="1988.7.13";
        su.major="식품영양";
        su.professor="556";

        iu.number =201353011;
        iu.name="아이유";
        iu.address="경기도천안시";
        iu.birth="1987.2.25";
        iu.major="철학";
        iu.professor="504";*/

        std.number =201350050;
        std.name="김태희";
        std.address="경기도 고양시";
        std.birth="1985.3.22";
        std.major="컴퓨터";
        std.professor="504";

        dept.major = "컴퓨터공학";
        dept.phone = "123-4567-8901";
        dept.office = "E동 2층";
        dept.chief = "504";

        subj.num = "0205";
        subj.subjname = "프로그래밍";
        subj.outline = "자바프로그래밍";
        subj.prof = "301";

        prof.no = "301";
        prof.name = "이순신";
        prof.mjfield = "프로그래밍";

        //학생
        System.out.println(std.number);
        System.out.println(std.name);
        System.out.println(std.address);
        System.out.println(std.birth);
        System.out.println(std.major);
        System.out.println(std.professor);

        System.out.println("--------------");

        //학과
        System.out.println(dept.major);
        System.out.println(dept.phone);
        System.out.println(dept.office);
        System.out.println(dept.chief);

        System.out.println("--------------");

        //과목
        System.out.println(subj.num);
        System.out.println(subj.subjname);
        System.out.println(subj.outline);
        System.out.println(subj.prof);

        System.out.println("--------------");

        //교수
        System.out.println(prof.no);
        System.out.println(prof.name);
        System.out.println(prof.mjfield);



    }
}
