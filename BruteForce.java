public class BruteForce {
    // Fungsi untuk menghitung rata-rata nilai UAS menggunakan Brute Force
    public static double calculateAverage(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }

    public static void main(String[] args) {
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        double averageUAS = calculateAverage(nilaiUAS);

        System.out.println("Rata-rata nilai UAS: " + averageUAS);
    }
}
