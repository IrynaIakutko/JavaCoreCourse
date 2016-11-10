

public class Task1 {
    public static void main(String[] args) throws Exception {
        try{
            throw  new Exception("New Exception 056");
        }catch (Exception e){

            System.out.println("We caught " + e.getMessage());
        }
        finally {
            System.out.println("Final ");
        }

    }
}

