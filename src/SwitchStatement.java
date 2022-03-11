public class SwitchStatement {
    public static void main(String[] args) {
        // Switch hanya digunakan untuk operasi ==
        char nilai = 'B';

        switch (nilai) {
            case 'A':
                System.out.println("Nilai Kamu Luar Biasa");
                break;
            case 'B':
                System.out.println("Nilai Kamu Bagus");
                break;
            case 'C':
                System.out.println("Nilai Kamu Cukup Bagus");
                break;
            case 'D':
                System.out.println("Nilai Kamu Kurang");
                break;
            default:
                System.out.println("Kamu Tidak Lulus");
                break;
        }

        // Lambda
        switch (nilai) {
            case 'A' -> System.out.println("Nilai Kamu Luar Biasa");
            case 'B' -> System.out.println("Nilai Kamu Bagus");
            case 'C' -> System.out.println("Nilai Kamu Cukup Bagus");
            case 'D' -> System.out.println("Nilai Kamu Kurang");
            default -> System.out.println("Kamu Tidak Lulus");
        }

        // Switch dengan Yield
        String ucapan = switch (nilai) {
            case 'A':
                yield "Nilai Kamu Luar Biasa";
            case 'B':
                yield "Nilai Kamu Bagus";
            case 'C':
                yield "Nilai Kamu Cukup Bagus";
            case 'D':
                yield "Nilai Kamu Kurang";
            default:
                yield "Kamu Tidak Lulus";
        };
        System.out.println(ucapan);

        // Switch tanpa Yield
        switch (nilai) {
            case 'A' -> System.out.println("Nilai Kamu Luar Biasa");
            case 'B' -> System.out.println("Nilai Kamu Bagus");
            case 'C' -> System.out.println("Nilai Kamu Cukup Bagus");
            case 'D' -> System.out.println("Nilai Kamu Kurang");
            default -> System.out.println("Kamu Tidak Lulus");
        }
        ;
        System.out.println(ucapan);
    }
}
