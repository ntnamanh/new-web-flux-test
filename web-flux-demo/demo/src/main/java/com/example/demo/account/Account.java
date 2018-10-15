package com.example.demo.account;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Size;

@Document(collection = "account")
@Data
@Getter
@Setter
public class Account {

    @Id
    private String id;
    private String username;
    @Size(min = 6, max = 10)
    private String password;
    private Information information;

    public Account() {
    }

    public Account(String username, @Size(min = 6, max = 10) String password, Information information) {
        this.username = username;
        this.password = password;
        this.information = information;
    }
}
