package ru.mirea.task3.Hum;
// для показа
public class Hand {
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
