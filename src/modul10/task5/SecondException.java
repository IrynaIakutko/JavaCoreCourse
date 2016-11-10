package task5;


public class SecondException extends Exception {
    private String testMessage = "Exception 2 tipe";

    @Override
    public String getMessage() {
        return testMessage;
    }
}