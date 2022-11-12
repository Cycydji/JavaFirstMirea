package ru.mirea.task3.Hum;
// для показа
public class Leg {
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
