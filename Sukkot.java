public class Main {
    public static int mostFrequentRoll(int[] rolls) {
        int[] counts = new int[6];

        for (int roll : rolls) {
            if (roll >= 1 && roll <= 6) {
                counts[roll - 1]++;
            }
        }

        int maxCount = 0;
        int mostFrequent = 1;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mostFrequent = i + 1;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] rolls = {1, 2, 3, 3, 6, 6, 6, 1, 5, 6};
        System.out.println("Most frequent roll: " + mostFrequentRoll(rolls));
    }
}
