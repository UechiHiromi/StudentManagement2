package raisetech.Students.Management;

public class Student {
  private  int studentId;
  private String name;
  private String nameKana;
  private String nick;
  private String mail;
  private String city;
  private int age;
  private String gender;

  public int getStudentId() {
    return studentId;
  }
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getNameKana() {
    return nameKana;
  }
  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }

  public String getNick() {
    return nick;
  }
  public void setNick(String nick) {
    this.nick = nick;
  }

  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
}
