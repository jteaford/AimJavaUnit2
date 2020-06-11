/**
 * assigns a grade based on the value of a test score: an A for a score of 90%
 * or above, a B for a score of 80% or above, and so on.
 */
class IfElseDemo {

    public static void main(String[] args) {
        char grade;

        int testscore = 88;

        // 90 - 100 = A
        grade = 'A';
        // 80 - 89 = B
        grade = 'B';
        // 70 - 79 = C
        grade = 'C';
        // 60 - 69 = D
        grade = 'D';
        // Under 60 = F
        grade = 'F';

        System.out.println("Grade = " + grade);
    }
}