package com.alberto.learnjpaandhibernate.course;

import com.alberto.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.alberto.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.alberto.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    // @Autowired
    // private CourseJdbcRepository repository;

    //@Autowired
    //private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1, "Learn Spring Boot", "Alberto"));
        repository.save(new Course(2, "Learn Spring JPA", "Alberto"));
        repository.save(new Course(3, "Learn Spring Core", "Alberto"));

        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByName("Learn Spring Boot"));
    }
}
