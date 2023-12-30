package com.alberto.learnjpaandhibernate.course.jdbc;

import com.alberto.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Spring Boot", "Alberto"));
        repository.insert(new Course(2, "Learn Spring CORE", "Alberto"));
        repository.insert(new Course(3, "Learn Java", "Alberto"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }
}
