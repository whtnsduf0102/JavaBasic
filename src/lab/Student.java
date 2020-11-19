package lab;

public class Student {

        int number; //학번
        String name;
        String address;
        String birth;
        String major;
        String professor;


        public Student(){
              name = "송혜교";
              address = "서울영등포구";
              birth = "1988.9.17";
              major = "컴퓨터";
              professor = "301";

        }

        public Student(String name, String address,
                       String birth, String major,
                       String professor){
                this.name = name;
                this.address = address;
                this.birth = birth;
                this.major = major;
                this.professor = professor;

        }
}

