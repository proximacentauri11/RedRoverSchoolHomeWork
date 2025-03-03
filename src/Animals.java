public class Animals {
    private String animalName;
    private String animalColor;
    private int animalAge;

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public String getAnimalColor() {
        return animalColor;
    }
    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }
    public int getAnimalAge() {
        return animalAge;
    }
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animals(String animalName, String animalColor, int animalAge) {
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalAge = animalAge;
    }

    public String animalSound() {
        return "Animal make sound";
    }

    public static void main(String[] args) {
        Cat Isay = new Cat("Isay", "Black", 8);
        Cat Misa = new Cat("Misa", "Black-White", 4);
        Dog Bobik = new Dog("Bobik", "Brown", 5);
        Horse Manya = new Horse("Manya", "White", 3);

        Animals[] animals = {Isay, Misa, Bobik, Manya};

        for (Animals animal : animals) {
            System.out.println("Animal name: " + animal.getAnimalName() +
                    "\nAnimal color: " + animal.getAnimalColor() +
                    "\nAnimal age: " + animal.getAnimalAge() +
                    "\nAnimal sound: " + animal.animalSound() +
                    "\n=============================");
        }
    }
}

class Cat extends Animals {
    public Cat(String animalName, String animalColor, int animalAge) {
        super(animalName, animalColor, animalAge);
    }
    @Override
    public String animalSound() {
        return "Meow";
    }
}
class Dog extends Animals {
    public Dog(String animalName, String animalColor, int animalAge) {
        super(animalName, animalColor, animalAge);
    }
    @Override
    public String animalSound() {
        return "Woof";
    }
}
class Horse extends Animals {
    public Horse(String animalName, String animalColor, int animalAge) {
        super(animalName, animalColor, animalAge);
    }
    @Override
    public String animalSound() {
        return "Igogo";
    }
}
