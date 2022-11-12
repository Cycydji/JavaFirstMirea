package ru.mirea.task3.Hum;
import java.util.Scanner;

public class Human {
    private String firstName, lastName;
    private int age;

    {
        firstName = "Sarah";
        lastName = "Coco";
        age = 67;

    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }

    public String toString(){
        return "->Your person is: " + firstName + " " + lastName + ", is " + age + " years old\n";
    }


    // пол, выбор для пользователя мужчина, женщина и ???
    public void classBody() {
        class Body {
            private final int gender;
            public Body(int i) { this.gender = i; }

            public String getGender(){
                return switch (gender) {
                    case (0) -> "->Oh! It's a woman\n";
                    case (1) -> "->Oh! It's a man\n";
                    default -> "->Gender are ???\n";
                };
            }

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пол: 0 - женщина, 1 - мужчина");
        Body hum = new Body(scanner.nextInt());
        System.out.println(hum.getGender());

    }


    //Описание головы с возможностью не описывать все полностью
    public void classHead(){
        class Head {
            private String eye, hair, hairColor, nose, eyebrows;
            {
                eye = "black";
                hair = "short";
                hairColor = "gray";
                nose = "humpback";
                eyebrows = "thick";
            }

            public void setEye(String eye) { this.eye = eye; }

            public void setHair(String hair) { this.hair = hair; }

            public void setHairColor(String hairColor) { this.hairColor = hairColor; }

            public void setNose(String nose) { this.nose = nose; }

            public void setEyebrows(String eyebrows) { this.eyebrows = eyebrows; }

            public String toString(){
                return "->" + firstName + " " + lastName + " has " + eye + " eyes, " + hair
                        + " " + hairColor + " hair, a " + nose + " nose and "
                        + eyebrows + " eyebrows\n";
            }

        }

        Head hum = new Head();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Опишите цвет глаз");
        String str0 = scanner.nextLine();
        if (!str0.equals("")){ hum.setEye(str0); }

        Scanner scanne = new Scanner(System.in);
        System.out.println("Опишите длину волос");
        String str1 = scanne.nextLine();
        if (!str0.equals("")){ hum.setHair(str1); }

        Scanner scann = new Scanner(System.in);
        System.out.println("Опишите цвет волос");
        String str2 = scann.nextLine();
        if (!str0.equals("")){ hum.setHairColor(str2); }

        Scanner scan = new Scanner(System.in);
        System.out.println("Опишите форму носа");
        String str3 = scan.nextLine();
        if (!str0.equals("")){ hum.setNose(str3); }

        Scanner sca = new Scanner(System.in);
        System.out.println("Опишите брови");
        String str4 = sca.nextLine();
        if (!str0.equals("")){ hum.setEyebrows(str4); }

        System.out.println(hum);

    }


    // Описание рук
    public void classHand() {
        class Hand {
            private final int shortness;
            public Hand(int i) { this.shortness = i; }

            public String getShortness(){
                return switch (shortness) {
                    case (0) -> "->hands are missing\n";
                    case (1) -> "->hand are quite short\n";
                    case (2) -> "->hand of medium length\n";
                    case (3) -> "->hand are long enough\n";
                    default -> "->hand are ???\n";
                };

            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Опишите руки: 0 - рук нет, 1 - короткие, 2 - нормальные, 3 - длинные");
        Hand hum = new Hand(scanner.nextInt());
        System.out.println(hum.getShortness());

    }


    // Описание ног, аналогично предыдущему классу
    public void classLeg(){
        class Leg {
            private final int shortness;
            public Leg(int i) { this.shortness = i; }

            public String getShortness(){
                return switch (shortness) {
                    case (0) -> "->legs are missing\n";
                    case (1) -> "->legs are quite short\n";
                    case (2) -> "->legs of medium length\n";
                    case (3) -> "->legs are long enough\n";
                    default -> "->legs are ???\n";
                };

            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Опишите ноги: 0 - ног нет, 1 - короткие, 2 - нормальные, 3 - длинные");
        Leg hum = new Leg(scanner.nextInt());
        System.out.println(hum.getShortness());
    }



}
