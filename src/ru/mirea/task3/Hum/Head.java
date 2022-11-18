package ru.mirea.task3.Hum;

import java.util.Objects;

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

    public void setEye(String eye) { if (!eye.equals("")){this.eye = eye;}}

    public void setHair(String hair) { if (!hair.equals("")) {this.hair = hair;}}

    public void setHairColor(String hairColor) { if (!hairColor.equals("")) {this.hairColor = hairColor;}}

    public void setNose(String nose) { if (!nose.equals("")) {this.nose = nose;}}

    public void setEyebrows(String eyebrows) { if (!eyebrows.equals("")){this.eyebrows = eyebrows;}}

    public String toString(){
        return  "Someone has " + eye + " eyes, " + hair
                + " " + hairColor + " hair, a " + nose + " nose and "
                + eyebrows + " eyebrows\n";
    }
}
