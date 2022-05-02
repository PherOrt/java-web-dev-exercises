package exercises.technology;

public class Computer extends AbstractEntity{
    private String name;
    private int storage;
    private int ports;
    private boolean portable;



    public Computer(String name, int storage, int ports){
        this.name = name;
        this.storage = storage;
        this.ports = ports;
        this.portable = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public String specs(){
        String spec = ("Name: " + name + "\n" +
                "Storage Space: " + storage + " Gigs" + "\n" +
                "Number of Ports: " + ports);
        return spec;
    }

    public String portable() {
        String portability;
        if(portable == true){
            portability = "is";
        }
        else{
            portability = "isn't";
        }
        return "This device "+ portability +  " portable.";
    }

}
