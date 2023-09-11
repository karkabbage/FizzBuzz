public class Multiples {

    public static void main(String[] args) {

        int total = 0;
        int i = 1000;

        while(i>2){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 || divisibleBy5){
                total++;
            }

            i--;
        }

        System.out.println(total);
    }
}
