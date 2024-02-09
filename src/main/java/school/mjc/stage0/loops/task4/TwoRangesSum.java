package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        for (int i = 0; i < 1; i++) {
            System.out.println(lastInRow);
            if (numberToSkip > 0) {
                continue;
            } else if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bugger then the last");
            } else if (lastInRow < 0) {
                System.out.println("last number in row is negative");
            }

        }
    }
}