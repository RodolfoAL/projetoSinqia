package modulo02project;

import modulo01project.Post;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String login;
    String password;

    List<modulo01project.Post> posts = new ArrayList<Post>();

    public User(String login, String name, String password) {
        this.login = login;
        this.name = name;
        this.password = password;
    }
}
