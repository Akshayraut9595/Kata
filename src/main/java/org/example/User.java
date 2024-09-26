package org.example;

import java.util.ArrayList;

public class User {
    String user_id;
    String user_name;
    String user_emailId;

    public User(String id, String name, String emailId){
        this.user_id = id;
        this.user_name = name;
        this.user_emailId = emailId;
    }

    public String getUser_id() {
        return user_id;
    }
}
