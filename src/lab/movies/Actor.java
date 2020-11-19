package lab.movies;

public class Actor {
    private String name;
    private String birth;
    private String[] appearmov;
    private String[] casting;
    public Actor(String name) {
        this.name = name;
    }
    public Actor(String name, String birth, String[] appearmov, String[] casting) {
        this.name = name;
        this.birth = birth;
        this.appearmov = appearmov;
        this.casting = casting;
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

    public String[] getCasting() {
        return casting;
    }

    public void setCasting(String[] casting) {
        this.casting = casting;
    }
}

