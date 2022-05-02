package exercises.technology;

public class Laptop extends Computer{
    private boolean portable;
    private int batterylife;

    public int getBatterylife() {
        return batterylife;
    }

    public Laptop(String name, int storage, int ports) {
        super(name, storage, ports);
        this.portable = true;
        this.batterylife = 48;
    }

    public boolean isPortable() {
        return portable;
    }

    @Override
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

    public String batteryPower(){
        return "The average batter life is " + batterylife + " hours long.";
    }
}
