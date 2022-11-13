package ru.mirea.task5.PackFurnit;
import java.util.Scanner;

public class Lamp extends Furniture{
    Lamp(String material, String typeBuyers, String size) {
        super(material, typeBuyers, size);
    }

    @Override
    public void delivery() {
        System.out.println("-Delivery will be the usual price, " +
                "but in general you could carry it in your hands..");
    }

    @Override
    public void assembling() {
        System.out.println("-Assembly is not needed, just screw in the light bulb");

        String yourVoid;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you need a light bulb?");
        yourVoid = in.next();
        if (yourVoid.equals("yes")){
            System.out.println("You will have to pay 1,000 rubles more!");
        }
    }

    public String toString() {
        return "a " + getSize() + "-sized " +
                getMaterial() + " {lamp}, type: " + getTypeBuyers() + "\n";
    }
}
