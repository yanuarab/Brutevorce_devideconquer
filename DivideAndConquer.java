public class DivideAndConquer {

    // Fungsi untuk mencari nilai UTS tertinggi menggunakan Divide and Conquer
    public static int findMaxUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;
        int leftMax = findMaxUTS(arr, left, mid);
        int rightMax = findMaxUTS(arr, mid + 1, right);

        return Math.max(leftMax, rightMax);
    }

    // Fungsi untuk mencari nilai UTS terendah menggunakan Divide and Conquer
    public static int findMinUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;
        int leftMin = findMinUTS(arr, left, mid);
        int rightMin = findMinUTS(arr, mid + 1, right);

        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};

        int maxUTS = findMaxUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        int minUTS = findMinUTS(nilaiUTS, 0, nilaiUTS.length - 1);

        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
    }
}
