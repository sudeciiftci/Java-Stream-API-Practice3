import java.util.Arrays;
import java.util.List;

public class StudentScoreValidator {

    public static void main(String[] args) {

        List<Integer> scores = Arrays.asList(75, 90, 45, 80, 60, 100);

        boolean anyPassedWith90 = scores.stream()
                .anyMatch(n -> n >= 90);

        boolean allPassed = scores.stream()
                .allMatch(n -> n >= 40);

        boolean noNegative = scores.stream()
                .noneMatch(n -> n < 0);

        System.out.println("Any student scored 90 or above: " + anyPassedWith90);
        System.out.println("All students passed: " + allPassed);
        System.out.println("No negative scores: " + noNegative);
    }
}