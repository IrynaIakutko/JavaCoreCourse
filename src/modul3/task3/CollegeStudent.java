package modul3.task3;


class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;


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


    CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id){
        super(firstName,lastName,group);
        this.collegeName=collegeName;
        this.rating=rating;
        this.id=id;
    }
    CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName,coursesTaken);
    }
    CollegeStudent(String firstName, String lastName, int group){
        super(firstName,lastName,group);
    }

   // public Student(String lastName, Course[] coursesTaken) {
   //     this.lastName = lastName;
   //     this.coursesTaken = coursesTaken;
   // }

//    public Student(String firstName, String lastName, int group) {
 //       this.firstName = firstName;
  //      this.lastName = lastName;
   //     this.group = group;

   // public CollegeStudent(String firstName, String lastName, int group) {
    //    super(firstName, lastName, group);

    }

   // public CollegeStudent(String firstName, String lastName, int group) {
    //    Student(firstName, lastName, group);
    //    super.firstName = firstName;
    //    super.lastName = lastName;
    //    super.group = group;
   // }






