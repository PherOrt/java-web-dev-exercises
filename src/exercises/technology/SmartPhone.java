package exercises.technology;

public class SmartPhone extends Computer{
    private boolean portable;
    private int batterylife;

    public boolean isPortable() {
        return portable;
    }

    public int getBatterylife() {
        return batterylife;
    }

    public SmartPhone(String name, int storage, int ports) {
        super(name, storage, ports);
        this.portable = true;
        this.batterylife = 80;
    }

    public String batteryPower(){
        return "The average batter life is " + batterylife + " hours long.";
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
}
