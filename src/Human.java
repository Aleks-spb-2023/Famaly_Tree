import java.util.ArrayList;

public class Human  {
    private String name;
    private int age;
    private String father;
//    ArrayList<String> child;

    public Human(String name, int age,String father){

        this.name = name;
        this.age = age;
        this.father = father;
//        this.child = child;

    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", father='" + father + '\'' +
                '}';
    }
}
