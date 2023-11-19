package com.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.entity.Student;
import com.studentmanagement.service.StudentService;

@Controller
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	// handler method to handle list of student and return model and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "students";

	}

	@GetMapping("/student/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/students";

	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", service.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		Student existingStudent = service.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		service.updateStudent(existingStudent);
		return "redirect:/students";

	}

	@GetMapping("/students/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		service.deleteStudentById(id);
		return "redirect:/students";

	}
}
