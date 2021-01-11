package tasks.leetCode.week1;

public class HappyNumber {

    public static boolean happyNumber(int n) {
        return happyNumberRecursive(n) == 1;
    }

    private static int happyNumberRecursive(int n) {
        int s = 0;
        if (n < 10) {
            return n;
        }
        while (n > 0) {
            int f = n % 10;
            s = s + (f * f);
            n /= 10;
        }
        return happyNumberRecursive(s);
    }
}
