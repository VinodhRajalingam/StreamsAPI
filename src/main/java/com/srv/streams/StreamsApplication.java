package com.srv.streams;

import com.srv.streams.beans.Departments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamsApplication {

	public static void main(String[] args) {
        callMethod();
		SpringApplication.run(StreamsApplication.class, args);
	}

    private static void callMethod() {

        Departments departments = new Departments();
    }

}
