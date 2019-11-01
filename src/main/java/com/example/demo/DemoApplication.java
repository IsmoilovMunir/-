package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.jdbc.PersonJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args);
	}
    @Autowired
	PersonJdbcDao personJdbcDao;
	@Override
	public void run(String... args) throws Exception {
		Person anna= new Person (100, "Anna", "Andreeva", "Samara");
		Person olesya= new Person (102, "Olesya", "Andreeva", "Samara");
		Person alex= new Person (103, "Alex", "Andreev", "Samara");


        personJdbcDao.insert(anna);
		personJdbcDao.insert(olesya);
		personJdbcDao.insert(alex);

		System.out.println("<<<<<<<<<<"+personJdbcDao.findAll());

	}
}
