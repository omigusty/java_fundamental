public class Method {
    public static void main(String[] args) {
        sayHello();
        myName("Omi", "Gusty");
        System.out.println(sum(20, 30));
        nilaiAkhir("Jimmy", 90, 89, 80, 75, 79);
    }

    // Method
    static void sayHello() {
        System.out.println("Hello, world!");
    }

    // Method with Paramater
    static void myName(String firstName, String lastName) {
        System.out.println("Hello my name is " + firstName + " " + lastName);
    }

    // Method return value
    static int sum(int number1, int number2) {
        int total = number1 + number2;
        return total;
    }

    // Method variable argument
    static void nilaiAkhir(String name, int... values) {
        int total = 0;

        for (int value : values) {
            total += value;
            System.out.println(total);
        }

        int finalResult = total / values.length;

        if (finalResult >= 75) {
            System.out.println(name + " kamu" + " lulus");
        } else {
            System.out.println(name + " kamu" + " tidak lulus");
        }
    }
}
