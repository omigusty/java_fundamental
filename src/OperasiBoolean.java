public class OperasiBoolean {
    public static void main(String[] args) {
        int nilaiTugas = 89;
        int nilaiUjian = 79;

        if (nilaiTugas >= 80 && nilaiUjian >= 80) {
            System.out.println("Nilai A");
        } else if (nilaiTugas >= 75 && nilaiUjian >= 75) {
            System.out.println("Nilai B");
        } else {
            System.out.println("Nilai C");
        }
    }
}
