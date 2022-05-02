package exercises.technology;

public class Main {

    public static void main(String[] args){

        Computer pc1 = new Computer("PC1", 250, 4);
        Laptop pc2 = new Laptop("PC2", 650, 3);
        SmartPhone pc3 = new SmartPhone("pc3", 1000, 1);

        System.out.println(pc1.specs());
        System.out.println(pc1.portable());
        System.out.println("ID: " + pc1.getId());

        System.out.println(" ");

        System.out.println(pc2.specs());
        System.out.println(pc2.portable());
        System.out.println(pc2.batteryPower());
        System.out.println("ID: " + pc2.getId());

        System.out.println(" ");

        System.out.println(pc3.specs());
        System.out.println(pc3.portable());
        System.out.println(pc3.batteryPower());

        System.out.println("ID: " + pc3.getId());

    }
}
