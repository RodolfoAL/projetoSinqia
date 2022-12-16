package modulo02project.socialnet;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String login;
    private String password;

    public List<Post> posts = new ArrayList<Post>();

    public User(String login, String name, String password) {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPosts() {
        return posts;
    }

}
