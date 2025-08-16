import java.util.Scanner;

public class missingnumber {
    public static int findMissing(int[] arr, int n) {

        long totalSum = (long) n * (n + 1) / 2;
        long arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return (int) (totalSum - arrSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (the range 1 to n): ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissing(arr, n);
        System.out.println("Missing number: " + missing);


    }
}
