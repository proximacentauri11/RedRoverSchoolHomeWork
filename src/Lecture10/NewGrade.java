package Lecture10;

public class NewGrade {

    private final int grade;

    public int getGrade() {
        return grade;
    }

    public NewGrade(int numGrage){
//        if (getGrade() < 1 || getGrade() > 5) {
//            throw new IllegalArgumentException("Оценки должны быть от 1 до 5");
//        }
        this.grade = numGrage;
    }

    public NewGrade(char letter){
        this(gradeExamine(letter));
    }

    public String gradeExamine(){
        String grade;
        switch (this.grade) {
            case 1: grade = "плохо"; break;
            case 2: grade = "неудовлетворительно"; break;
            case 3: grade = "удовлетворительно"; break;
            case 4: grade = "хорошо"; break;
            case 5: grade = "отлично"; break;
            default: throw new IllegalArgumentException("Оценки должны быть от 1 до 5");
        } return grade;
    }

    public static int gradeExamine(char letter){
        int numGrade;
        switch (letter) {
            case 'A' -> numGrade = 5;
            case 'B' -> numGrade = 4;
            case 'C' -> numGrade = 3;
            case 'F' -> numGrade = 1;
            default -> throw new IllegalArgumentException("Оценки должны быть от A, B, C, F");
        } return numGrade;
    }

    public static void main(String[] args) {
        NewGrade max = new NewGrade('A');
        NewGrade min = new NewGrade(1);
        System.out.println(max.gradeExamine());
        System.out.println(min.gradeExamine());
    }
}