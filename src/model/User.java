package model;

import java.util.List;

public class User {
//     private Integer id;
private String username;
private String password;
private Boolean enabled;

List<Authority> authorities;

public User (String username, String password) {
    this.username = username;
    this.password = password;
}

public void addAuthority(String string) {
}

public Object getUsername(username name) {
    return name;
}
}
