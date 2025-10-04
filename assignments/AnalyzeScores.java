import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        int sum = 0;

        // Input scores
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        
        double average = (double) sum / n;

        
        int above = 0, below = 0;
        for (int score : scores) {
            if (score >= average) {
                above++;
            } else {
                below++;
            }
        }

        
        int max = scores[0], min = scores[0];
        for (int score : scores) {
            if (score > max) max = score;
            if (score < min) min = score;
        }

        
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.println("Number of scores >= average: " + above);
        System.out.println("Number of scores < average: " + below);

       
    }
}
