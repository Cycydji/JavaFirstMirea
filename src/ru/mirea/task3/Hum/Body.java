package ru.mirea.task3.Hum;
// для показа
public class Body {

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
