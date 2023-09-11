
public class Reduce {
    public static void main(String[] args) {

        int start = 100;
        int totalReps = 0;

        while (start > 0) {
            boolean evenNum = start % 2 == 0;

            if (evenNum) {
                start = start / 2;
            } else {
                start = start - 1;
            }

            totalReps++;

        }

        System.out.println(totalReps);
    }
}