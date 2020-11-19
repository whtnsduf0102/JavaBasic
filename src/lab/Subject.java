package lab;

public class Subject {
    String num; //과목번호
    String subjname; //과목명
    String outline; //과목개요
    String prof; //담당교수

    public Subject(){
        num ="0211";
        subjname="드레스코드";
        outline="옷입기의 기초";
        prof ="445";

    }
    public Subject(String num,String subjname, String outline,
                   String prof) {

        this.num =num;
        this.subjname = subjname;
        this.outline =outline;
        this.prof =prof;
    }

}
