package task4;

class FirstException extends Exception {
    private String testMessage;

    public FirstException(String testMessage) {
        this.testMessage = testMessage;
    }

    @Override
    public String getMessage() {
        return testMessage;
    }
}
