package lab.movies;

import lab.movies.Actor;
import lab.movies.Director;
import lab.movies.Movie;
import lab.movies.Produc_Com;

public class MovieMain {
    public static void main(String[] args) {
        String[] genre = {"드라마"};
        String[] dirtor = {"스콧 프랭크", "앨런 스코트"};
        String[] actor = {"애니아", "토머스", "해리"};
        String summer = "퀸스갬빗은 넷플릭스에서 2020년 10월 ....";
        String desc = "1950년 한 보육원, 체스에 천재적인 ....";

        Movie mov = new Movie("퀸즈컴벳", "2020", 350, "넷플릭스",
                genre, dirtor, actor, summer, desc);
        /*Produc_Com comp = new Produc_Com();
        Director dirt = new Director();
        Actor act = new Actor();*/
        System.out.println(mov.getTitle());
        System.out.println(mov.getYear());
        System.out.println(mov.getRuntime());
        System.out.println(mov.getPrdtin());
        for(int i=0; i<genre.length; i++)
            System.out.print(mov.getGenre()[i]);
        System.out.println("");
        for(int i=0; i<dirtor.length; i++)
            System.out.print(mov.getDirtor()[i]);
        System.out.println("");
        for(int i=0; i<actor.length; i++)
            System.out.print(mov.getActor()[i]);
        System.out.println("");
        System.out.println(mov.getSummary());


    }
}