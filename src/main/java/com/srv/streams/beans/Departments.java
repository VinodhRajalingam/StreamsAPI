package com.srv.streams.beans;

import lombok.Data;

import java.util.List;

@Data
public class Departments {

    private String name;
    private List<Person> persons;

}
