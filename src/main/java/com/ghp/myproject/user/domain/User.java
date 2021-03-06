package com.ghp.myproject.user.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class User {

    public long id;
    public LocalDateTime regDate;
    public LocalDateTime updateDate;
    public String email;
    public String password;
    public String name;
}
