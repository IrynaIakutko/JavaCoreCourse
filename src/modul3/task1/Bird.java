package modul3.task1;

public class Bird {
    private  String name;
    private String textSing;
  public   void sing(){
        System.out.println("I am "+textSing);
    }

    public Bird(String name, String textSing) {
        this.name = name;
        this.textSing = textSing;

    }
}

