package Arrays;

import java.util.Scanner;

public class analyzeScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[100];
        int sum = 0;
        int count = 0;

        while(true){
          int score = sc.nextInt();

          if(score < 0){
              break;
          }

          if(count < 100){
              scores[count] = score;
              sum+=score;
              count++;
          } else {
              System.out.println("Maximum number of scores(100) has been reached");
              break;
          }
        }

        double average = (count == 0) ? 0 : (double) sum / count;
        int above = 0;
        int below = 0;

      for(int i = 0; i< count;i++){
          if(scores[i] >= average){
              above++;
          } else{
              below++;
          }
      }

        System.out.println("Avg "+average);
        System.out.println("Above "+above);
        System.out.println("below "+below);

    }
}
