public class FizzBuzzProblem {

    public void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            String concat = "";

            if (i % 3 == 0) {
                concat += "Fizz";
            }
            if (i % 5 == 0) {
                concat += "Buzz";
            }
            if (concat.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(concat);
            }
        }
    }
}
