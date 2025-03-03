package Lecture10;

public class GrangGrandChild extends Grandchild {

    private final String firstName;

    public GrangGrandChild(String lastName, String firstName) {
        super(lastName);
        this.firstName = firstName;
    }
    public String whoAmI(){
        return "1 " + getNumber();
    }
}
