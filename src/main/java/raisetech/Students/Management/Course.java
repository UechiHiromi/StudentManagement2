package raisetech.Students.Management;

public class Course {
  private  int courseId;
  private String courseName;
  private String startDate;
  private String endDate;

  public int getCourseId() {
    return courseId;
  }
  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  public String getCourseName() {
    return courseName;
  }
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getStartDate() {
    return startDate;
  }
  public void setStart_date(String startDate) {
    this.startDate= startDate;
  }

  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
}
