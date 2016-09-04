package modul3.task3;

import java.util.Date;


public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

}
