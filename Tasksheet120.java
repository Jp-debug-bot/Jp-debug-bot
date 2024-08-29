public class CumulativeSum {
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int number : numbers) {
            int cumulativeSum = 0;
            for (int i = 1; i <= number; i++) {
                cumulativeSum += i;
            }
            totalSum += cumulativeSum;
            System.out.println("Cumulative sum for " + number + " is: " + cumulativeSum);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int sum = cumulativeSum(4, 5, 10);
        System.out.println("Total sum of cumulative sums is: " + sum);
    }
}
