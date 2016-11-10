

public class Task2 {
    public static void main(String[] args) throws ExceptionClass {
        try {
            checkString("notTry");

        } catch (ExceptionClass e) {

            e.ownMetod();

        } finally {
            checkString("try");
        }

    }

    private static class ExceptionClass extends Exception {
        public ExceptionClass(String message) {
            super(message);
            System.out.println(message);
        }

        public void ownMetod() {
            System.out.println(getMessage());
        }
    }


    private static void checkString(String test) throws ExceptionClass {
        if (test.equals("try")) {
            System.out.println("OK");
        } else {

            throw new ExceptionClass("This is problem");

        }
    }
}







