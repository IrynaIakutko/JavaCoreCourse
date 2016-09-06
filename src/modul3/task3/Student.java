package modul3.task3;

class Student {
    private String firstName;
  private String lastName;
   private int group;
 private Course[] coursesTaken;
    private int age;


    // With 2 constructors firstName, lastName, group; and lastName, coursesTaken.

    public void setAge(int age) {
        this.age = age;
    }

    public void setCoursesTaken(Course[] coursesTaken) {

        this.coursesTaken = coursesTaken;
    }

    public void setGroup(int group) {

        this.group = group;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public int getAge() {

        return age;
    }

    public Course[] getCoursesTaken() {

        return coursesTaken;
    }

    public int getGroup() {

        return group;
    }

    public String getLastName() {

        return lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

     Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;

    }

}
