package raisetech.Students.Management;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface StudentsRepository {
  @Select("SELECT * FROM students WHERE name = #{name}")
  Student searchByName(String name);

  @Insert("INSERT students values(#{studentId},#{name},#{nameKana},#{nick},#{mail},#{city},#{age},#{gender})")

  void registerStudent(int studentId, String name,String nameKana,String nick,
      String mail,String city,int age,String gender);

}
