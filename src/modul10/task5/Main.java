package task5;

public class Main {
    static void methodTest() throws FirstException, SecondException, ThirdException {
        throw new FirstException();
    }
        public static void main(String[] args) {
        try{
            methodTest();
        } catch (FirstException | SecondException | ThirdException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}





