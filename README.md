
# Student Management System
**Introduction** :
This is a simple web application for managing student information. It allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.




## Technologies Used
- **Spring Boot**: The backend framework used to build the application.
- **Thymeleaf**: A server-side Java template engine for web and standalone environments.
- **PostgreSQL**: The relational database used to store student data.
## Getting Started
1. **Database Setup**:
- Create a PostgreSQL database named sms.
- Set the database username and password in the application.properties file.
2. **Run the Application:**
- Execute the 'main' method in the 'StudentManagementWebAppApplication' class to start the Spring Boot application.
3. **Access the Application:**
- Open a web browser and go to 'http://localhost:8080' to access the Student Management System.

## Features
**1. Create Student**
- Click on "Add Student" in the navigation bar.
- Fill in the student's first name, last name, and email in the form.
- Click "Submit" to add the new student.
**2. Update Student**
- On the list of students, click "Update" next to the student you want to edit.
- Modify the student's information in the form.
- Click "Submit" to save the changes.
**3. Delete Student**
-On the list of students, click "Delete" next to the student you want to remove.
- Confirm the deletion.
**4. View List of Students**
- The homepage displays a list of all students.
- Each student entry includes their first name,   last name, and email.
- Click "Update" to edit a student.
- Click "Delete" to remove a student.
## Project Structure
- **Controller**: Handles web requests and manages the flow of data between the Model and the View.
- **Entity**: Represents the data model (Student entity in this case).
- **Repository**: Manages the interaction with the database.
- **Service**: Contains business logic and communicates between the controller and repository.
## Known Issues
- None at the moment.
## Future Enhancements
- Implement user authentication and authorization.
- Add validation to ensure data integrity.
- Improve the user interface for a better user experience.

Feel free to contribute to the project and make it even better!
## Author
- Wasim Shaikh(Java Developer)
## Screenshots

![App Screenshot](/student-management-web-app/src/main/resources/static/Screenshot%20(193).png)

