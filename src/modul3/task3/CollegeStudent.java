package modul3.task3;


public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public long getId() {
        return id;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super.lastName = lastName;
        super.coursesTaken= coursesTaken;
    }

    public CollegeStudent(String firstName, String lastName, int group) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.group = group;
    }
}
