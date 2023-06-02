package com.srv.streams.beans;

import com.srv.streams.mock.MockData;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class PersonTest  {
    @Test
    void collect() throws IOException {

        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(Collectors.toList());
        emails.forEach(System.out::println);
    }

    @Test
    void filter() throws IOException {

        List<Person> people = MockData.getPeople();
        List<Person> major = people.stream().filter(p -> p.getAge() > 18)
                .collect(Collectors.toList());
        major.forEach(System.out :: println);
    }

    @Test
    public void statistics() throws Exception {
        List<Person> cars = MockData.getPeople();
        DoubleSummaryStatistics statistics = cars.stream()
                .mapToDouble(Person::getAge)
                .summaryStatistics();
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getAverage());
        System.out.println(BigDecimal.valueOf(statistics.getSum()));
    }
}