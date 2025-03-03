public class Grandchild extends Child{

    final String lastName;

    public Grandchild(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String whoAmI(){
        return "NOT " + super.whoAmI() + "\nI am a grandchild with name " + name;
    }
}
