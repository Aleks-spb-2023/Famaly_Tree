import java.util.ArrayList;

public class Famaly {
    private String lastname = "Ruricovich";

    private ArrayList<Human> person;


public Famaly(ArrayList<Human> person){
    this.person = person;
}

    @Override
    public String toString() {
        return "Famaly{" +
                "lastname='" + lastname + '\'' +
                ", person=" + person +
                '}';
    }
}



