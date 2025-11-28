package raisetech.StudentManagement.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.deta.Course;
import raisetech.StudentManagement.deta.Student;
import raisetech.StudentManagement.service.StudentService;

@RestController

public class StudentController {
  private StudentService service;

  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }
    @GetMapping("/students")
    public List<Student> getStudentList () {
      return service.searchStudentList();
    }

    @GetMapping("/studentsCourses")
    public List<Course> getCourseList () {
      return service.CourseList();


    }

}
