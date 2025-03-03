package Lecture10;

public class downgrade {

    private final int grade;

    public downgrade(int grade) {
        this.grade = grade;
    }

    public downgrade(char letter) {
        this(gradeExamine(letter));
    }

    public String gradeExamineStatement() {
        switch (this.grade) {
            case 1:
                return "плохо";
            case 2:
                return "неудовлетворительно";
            case 3:
                return "удовлетворительно";
            case 4:
                return "хорошо";
            case 5:
                return "отлично";
            default:
                throw new IllegalArgumentException("Оценки должны быть от 1 до 5");
        }
    }

    public String gradeExamineExpression() {
        return switch (this.grade) {
            case 1 -> "плохо";
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> throw new IllegalArgumentException("Оценки должны быть от 1 до 5");
        };
    }

    public static int gradeExamine(char letter) {
        return switch (letter) {
            case 'A' -> 5;
            case 'B' -> 4;
            case 'C' -> 3;
            case 'F' -> 1;
            default -> throw new IllegalArgumentException("Оценки должны быть от A, B, C, F");
        };
    }

    public static void main(String[] args) {
        downgrade max = new downgrade('C');
        downgrade min = new downgrade(5);
        System.out.println(max.gradeExamineStatement());
        System.out.println(min.gradeExamineExpression());
    }
}