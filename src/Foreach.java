public class Foreach {
    public static void main(String[] args) {
        String[] peoples = { "Jimmy", "Chairperson", "Sabrina", "Carpenter" };

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i]);
        }

        System.out.println("=========================");

        // Foreach
        for (String people : peoples) {
            System.out.println(people);
        }
    }
}
