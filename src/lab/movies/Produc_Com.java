package lab.movies;

public class Produc_Com {
    private String name;
    private String addr;
    private String[] movie;

    public Produc_Com() {
    }

    public Produc_Com(String name, String addr, String[] movie) {
        this.name = name;
        this.addr = addr;
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String[] getMovie() {
        return movie;
    }

    public void setMovie(String[] movie) {
        this.movie = movie;
    }
}
