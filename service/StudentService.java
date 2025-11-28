package raisetech.StudentManagement.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.StudentManagement.Repository.StudentRepository;
import raisetech.StudentManagement.deta.Course;
import raisetech.StudentManagement.deta.Student;

@Service
public class StudentService {
  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository){
    this.repository = repository;
  }
  public List<Student> searchStudentList(){
    //検索処理
    return repository.search()
        .stream()
        .filter(s -> s.getAge() >= 30 && s.getAge() <= 39)

        .collect(Collectors.toUnmodifiableList());
    //絞り込みをする。年齢が３０代の人のみを抽出する。抽出したリストをコントローラーに返す。

    //
  }

  public List<Course> CourseList(){
 //絞り込み検索で「Javaコース」のコース情報のみ抽出する。
    //抽出したリストをコントローラーに返す。
    return repository.searchbycourse()
        .stream()
        .filter(c -> c.getCourseName().contains("Java"))
        .collect(Collectors.toList());

  }

}
