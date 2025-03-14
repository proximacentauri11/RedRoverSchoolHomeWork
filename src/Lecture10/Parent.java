package Lecture10;

public class Parent extends Object {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String whoAmI(){
        return "I am a parent";
    }
}
