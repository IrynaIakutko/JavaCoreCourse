package modul3.task3;

class SpecialStudent extends CollegeStudent  {
    //  Create three constructors: two the same as in CollegeStudend and one with secretKey field.

    private long secretKey;
    private String email;

    SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName,coursesTaken);
    }

    SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName,lastName,group,collegeName,rating,id);
    }
    public SpecialStudent(String firstName, String lastName, int group,String collegeName,int rating,long id,long secretKey) {
        super(firstName,lastName,group,collegeName,rating,id);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSecretKey(long secretKey) {

        this.secretKey = secretKey;
    }

    public String getEmail() {

        return email;
    }


}


