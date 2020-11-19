package lab;

public class Movie {
    String name;
    String year;
    String time;
    String genre;
    String plotl; //줄거리
    String intro; //영화 소개

    public Movie(String name, String year, String time, String genre, String plotl, String intro) {
        this.name = name;
        this.year = year;
        this.time = time;
        this.genre = genre;
        this.plotl = plotl;
        this.intro = intro;
    }
}

