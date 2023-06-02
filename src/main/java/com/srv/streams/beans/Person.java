package com.srv.streams.beans;

import lombok.Data;

import java.util.List;

@Data
public class Person {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String gender;
    private final Integer age;
}
