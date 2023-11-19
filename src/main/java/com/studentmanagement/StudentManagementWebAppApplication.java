package com.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentmanagement.entity.Student;
import com.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementWebAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementWebAppApplication.class, args);
	}
}
