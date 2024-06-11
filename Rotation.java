public class Rotation {

    public static void rotLeft(int[] a, int d) {
        int n = a.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int newPosition = (i + n - d) % n;
            result[newPosition] = a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
