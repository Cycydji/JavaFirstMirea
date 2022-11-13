package ru.mirea.task5.PackFurnit;

public class Jacuzzi extends Furniture{
    private final int volume;
    Jacuzzi(String material, String typeBuyers, String size, int volume) {
        super(material, typeBuyers, size);
        this.volume = volume;
    }

    @Override
    public void delivery() {
        System.out.println("-Delivery will be very expensive and long in time");
        if (volume > 450){
            System.out.println("You will have to pay 10,000 rubles more! " +
                    "Why? The volume of your jacuzzi is " + volume );
        }
    }

    @Override
    public void assembling() {
        System.out.println("-The assembly will be very expensive and will take several days");
    }

    public String toString(){
        return "a " + getSize() + "-sized " +
                getMaterial() + " {jacuzzi}, type: "+ getTypeBuyers() + "\n";
    }


}
