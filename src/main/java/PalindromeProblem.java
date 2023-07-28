public class PalindromeProblem {

    public boolean solve(String s) {
        // define 2 pointers (forward pointer and backward pointer and compare characters accordingly)
        // commenting

        int lowIndex = 0;
        int highIndex = s.length()-1;

        while (lowIndex < highIndex) {
            if (s.charAt(lowIndex) != s.charAt(highIndex)) {
                return false;
            }
            lowIndex++;
            highIndex--;
        }
        return true;
    }

}
