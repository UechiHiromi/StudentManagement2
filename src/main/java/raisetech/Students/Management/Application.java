package raisetech.Students.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @Autowired
  private StudentsRepository repository;
  @Autowired
  private CourseRepository courserepository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

  }

  @GetMapping("/students")
  public String getStudent(@RequestParam String name) {
    Student student = repository.searchByName(name);
    return student.getStudentId() + student.getName() + student.getNameKana() + student.getNick() +
        student.getMail() + student.getCity() + student.getAge() + student.getGender();
  }

  @PostMapping("/students")
  public void registerStudent(int studentId, String name, String nameKana, String nick,
      String mail, String city, int age, String gender) {
    repository.registerStudent(studentId, name, nameKana, nick, mail, city, age, gender);

  }
  @GetMapping("/studentsCourses")
  public String getcourse(@RequestParam String courseName) {
    Course course = courserepository.searchBycourse(courseName);
    return course.getCourseId() + course.getCourseName() + course.getStartDate() + course.getEndDate();
  }
  @PostMapping("/studentsCourses")
  public void registerCourse(int courseId,String courseName,String startDate,String endDate) {
    courserepository.registerCourse(courseId,courseName,startDate,endDate);

  }



}
