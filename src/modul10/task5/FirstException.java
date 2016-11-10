package task5;

class FirstException extends Exception {
        private String testMessage = "Exception 1 tipe";

             @Override
    public String getMessage() {
        return testMessage;
    }
}