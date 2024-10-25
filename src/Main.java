import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int rowMax = 0;
        int columnMin = 1000000;

        int kPrevious = 0;
        int mPrevious = 0;

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int m = scanner.nextInt();
            if (kPrevious == k && mPrevious == m - 3) {
                if (k > rowMax) {
                    rowMax = k;
                    columnMin = mPrevious + 1;
                } else if (k == rowMax) columnMin = Math.min(columnMin, mPrevious + 1);
            }
            kPrevious = k;
            mPrevious = m;
        }

        System.out.println("Макисмальный ряд: " + rowMax);
        System.out.println("Минимальный номер места: " + columnMin);
    }
}