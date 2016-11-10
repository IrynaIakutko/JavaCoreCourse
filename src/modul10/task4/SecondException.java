package task4;


public class SecondException extends Exception {
    private String testMessage = "SecondException";

    @Override
    public String getMessage() {
        return testMessage;
    }
}
