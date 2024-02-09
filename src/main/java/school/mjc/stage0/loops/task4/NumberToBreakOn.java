package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int end = Math.min(toBreakWith, numberToGoUntil);
        System.out.println(numberToGoUntil < toBreakWith ? "Iterating till the end:" : "Iterating till the break number:");
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java NumberToBreakOn <toBreakWith> <numberToGoUntil>");
            return;
        }

        int toBreakWith = Integer.parseInt(args[0]);
        int numberToGoUntil = Integer.parseInt(args[1]);

        new NumberToBreakOn().printNumbersUntilWithBreakOn(toBreakWith, numberToGoUntil);
    }
}
