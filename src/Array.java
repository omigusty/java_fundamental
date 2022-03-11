public class Array {
    public static void main(String[] args) {
        // Membuat Array
        String[] students = { "Andreas", "Jimmy", "Tamara" };

        // Menampilkan isi array
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println(students[2]);

        // menghitung total isi array
        System.out.println(students.length);

        // Edit isi array
        students[0] = "Adam";
        System.out.println(students[0]);

        // Array didalam Array
        String members[][] = {
                { "Omi", "Gusty" },
                { "Jimmy", "Chairperson" },
                { "Agus", "Susanto" }
        };

        System.out.println(members[1][1]);
    }
}
