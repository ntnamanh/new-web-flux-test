package com.example.demo.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@AllArgsConstructor
public class Information {

    private String firstName;
    private String lastName;
    @Indexed
    private int age;
    private String address;
    private String email;
    private String phone;
}
