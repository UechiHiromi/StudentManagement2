package raisetech.StudentManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.Repository.StudentRepository;
import raisetech.StudentManagement.deta.Course;
import raisetech.StudentManagement.deta.Student;

@SpringBootApplication

public class StudentManagementApplication {



  public static void main(String[] args) {
    //localhost:8080
    SpringApplication.run(StudentManagementApplication.class, args);
  }


}

