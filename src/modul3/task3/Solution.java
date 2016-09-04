package modul3.task3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        //Create 5 objects Course class. Create objects of others classes using every constructor. You must have 13 objects in Solution class.
        Course cour1 = new Course("physics", 3, "Ivanova");

        Course cour2 = new Course("mathematic", 5, "Tereschenko");

        Course cour3 = new Course("stinks", 7, "Marchenko");

        //public Course(String name, int hoursDuration, String teacherName)
        // public Course(Date startDate, String name)
        Date c2 = new Date();

        Course cour4 = new Course(c2,"Lirionova");
        cour4.setName("philosophy");

        Course cour5 = new Course(c2, "Geranova");
        cour5.setName("analysis");

        // 6   public Student(String lastName, Course[] coursesTaken)
         Course[] coursesTaken = {cour1, cour2, cour3};
        Student yana = new Student("Levaya", coursesTaken);

        // 7 public Student(String firstName, String lastName, int group)
        Student boris = new Student("Boris", "Yakimov", 71);

        // 8 public CollegeStudent(String collegeName, int rating, long id)
        CollegeStudent lora = new CollegeStudent("OKKT", 41, 2431);

        //  9 public CollegeStudent(String lastName, Course[] coursesTaken)
        CollegeStudent Vika = new CollegeStudent("Zayceva", coursesTaken);

        // 10  public CollegeStudent(String firstName, String lastName, int group)
        CollegeStudent nastya = new CollegeStudent("Nastya", "Rulikova", 32);

        //  11  public SpecialStudent(String collegeName, int rating, long id)
        SpecialStudent alla = new SpecialStudent("OKKT", 12, 345);

        // 12 public SpecialStudent(String firstName, String lastName, int group)
        SpecialStudent genya = new SpecialStudent("Genya", "Yakus", 24);

        // 13 public SpecialStudent(long secretKey
        SpecialStudent yoriy = new SpecialStudent(1245);

    }


}
