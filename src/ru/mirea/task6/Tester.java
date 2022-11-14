package ru.mirea.task6;

public class Tester {

    public static void main(String[] args) {

        System.out.println("-test of the 'Steamers' class-");

        Steamers s0 = new Steamers();
        s0.setName("Alison");
        System.out.println("First streamer's name: " + s0.getName());

        Steamers s1 = new Steamers();
        s1.setName("Dawgos");
        System.out.println("Second streamer's name: " + s1.getName());

        Steamers s2 = new Steamers();
        s2.setName("Mightypoot");
        System.out.println("Third streamer's name: " + s2.getName());



        System.out.println("\n-test of the 'Auto' class-");

        Auto a0 = new Auto();
        a0.setName("Daewoo Matiz");
        System.out.println("First auto's name: " + a0.getName());

        Auto a1 = new Auto();
        a1.setName("Bugatti Charon");
        System.out.println("Second auto's name: " + a1.getName());

        Auto a2 = new Auto();
        a2.setName("Ford Mustang");
        System.out.println("Third auto's name: " + a2.getName());



        System.out.println("\n-test of the 'Juice' class-");

        Juice j1 = new Juice();
        j1.setPrice(43.70);
        System.out.println("First juice's price: " + j1.getPrice());

        Juice j2 = new Juice();
        j2.setPrice(77.99);
        System.out.println("Second juice's price: " + j2.getPrice());


        System.out.println("\n-test of the 'Wallet' class-");

        Wallet w1 = new Wallet();
        w1.setPrice(340.55);
        System.out.println("The cost of a polymer wallet: " + w1.getPrice());

        Wallet w2 = new Wallet();
        w2.setPrice(9750.0);
        System.out.println("The cost of a leather Wallet: " + w2.getPrice());


    }
}
