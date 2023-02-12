import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human child = new Human("Vova", 9);
        Human Alex = new Human("Aleksandra", 30,"Pavel");
        Human child2 = new Human("grigoriy", 5);
        Human igor = new Human("Igor", 34, "Vladimir");

        ArrayList<Human> ps = new ArrayList<>();
        ps.add(child);
        ps.add(Alex);
        ps.add(child2);
        ps.add(igor);

        Famaly fam = new Famaly(ps);
        System.out.println("__________________________________");
        System.out.println(fam);






    }





}
