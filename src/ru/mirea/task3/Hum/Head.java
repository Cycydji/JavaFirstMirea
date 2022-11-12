package ru.mirea.task3.Hum;
// для показа
public class Head {

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
        return  "Someone has " + eye + " eyes, " + hair
                + " " + hairColor + " hair, a " + nose + " nose and "
                + eyebrows + " eyebrows\n";
    }
}
