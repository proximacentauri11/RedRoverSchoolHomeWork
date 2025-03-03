public class Calc extends Object{
    public double add(int a, int b) {
        return a + b;
    }
    public double add(int a, float b) {
        return a + b;
    }
    public double add(float a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2, 2));
        System.out.println(c.add(2, 2f));
        System.out.println(c.add(2f, 2));
    }
}
