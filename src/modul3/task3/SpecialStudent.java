package modul3.task3;

public class SpecialStudent extends CollegeStudent  {
    //  Create three constructors: two the same as in CollegeStudend and one with secretKey field.

    long secretKey;
    String email;

    public SpecialStudent(String collegeName, int rating, long id) {
        super(collegeName,rating,id);
    }

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }
    public SpecialStudent(long secretKey) {

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


