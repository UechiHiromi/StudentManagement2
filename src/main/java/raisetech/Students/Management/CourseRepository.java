package raisetech.Students.Management;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


  @Mapper
  public interface CourseRepository {

    @Select("SELECT * FROM studentsCourses WHERE CourseName = #{courseName}")
    Course searchBycourse(String courseName);


    @Insert("INSERT studentsCourses values(#{courseId},#{courseName},#{startDate},#{endDate})")
    void registerCourse(int courseId,String courseName,String startDate,String endDate);

  }


