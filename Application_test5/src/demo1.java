public class demo1 {
    public int minus(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        demo1 calc = new demo1();
        int result = calc.minus(10, 4);
        System.out.println("Result: " + result); // Output: Result: 6
    }
}
