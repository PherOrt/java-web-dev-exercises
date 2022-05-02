package exercises.technology;

public class AbstractEntity {
    private int id;
    private static int counter = 1;

    public AbstractEntity(){
        this.id = counter;
        counter++;

    }

    public int getId() {
        return id;
    }
}
