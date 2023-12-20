package model;

import java.io.Serializable;

public class Authority {

private AuthorityId id;
private User username;
private String authority;

public Authority(User user, String authority) {
    Authority.AuthorityId id = new Authority.AuthorityId(user.getUsername(), authority);
    this.id = id;
    this.username = user;
    this.authority = authority;
}

public static class AuthorityId implements Serializable {
    private String username;
    private String authority;
    }
}
