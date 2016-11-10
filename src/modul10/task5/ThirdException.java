package task5;
public class ThirdException extends Exception {
    private String testMessage = "Exception 3 tipe";

      @Override
      public String getMessage() {
        return testMessage;
    }
}
