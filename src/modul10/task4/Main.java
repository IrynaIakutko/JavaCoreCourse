package task4;

public class Main {

    public static void main(String[] args) {
                try {
            f();
        } catch (SecondException e) {
            System.out.println("SecondException. Message: " + e.getMessage());
        } finally {
            System.out.println("Final block");
        }
    }

    static void g() throws FirstException {

        throw new FirstException("FirstException");
    }

    static void f() throws SecondException {
        try {
            g();
        } catch (FirstException e) {
            System.out.println("FirstException. Message: " + e.getMessage());
            throw new SecondException();
        }
    }




}
