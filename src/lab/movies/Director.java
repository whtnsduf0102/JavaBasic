package lab.movies;

public class Director {
    private String name;
    private String birth;
    private String[] appearmov;
    private String[] mademov;

    public Director() {
    }

    public Director(String name, String birth, String[] appearmov, String[] mademov) {
        this.name = name;
        this.birth = birth;
        this.appearmov = appearmov;
        this.mademov = mademov;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String[] getAppearmov() {
        return appearmov;
    }

    public void setAppearmov(String[] appearmov) {
        this.appearmov = appearmov;
    }

    public String[] getMademov() {
        return mademov;
    }

    public void setMademov(String[] mademov) {
        this.mademov = mademov;
    }
}
