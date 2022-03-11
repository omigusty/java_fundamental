public class TernaryOperator {
    public static void main(String[] args) {
        int nilaiTotal = 75;

        if (nilaiTotal >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        // Ternary Operator
        var congrats = nilaiTotal >= 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(congrats);

        System.out.println(nilaiTotal >= 75 ? "Lulus" : "Tidak Lulus");
    }
}
