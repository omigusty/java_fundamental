public class Recursive {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialLoop(5));
    }

    static int factorialLoop(int value) {
        int number = 1;

        for (int counter = 1; counter <= value; counter++) {
            number *= counter;
        }
        return number;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
