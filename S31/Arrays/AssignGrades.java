package Arrays;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int numStudents = sc.nextInt();

        int[] scores = new int[numStudents];

        System.out.println("Enter "+ numStudents+" scores: ");
        for(int i = 0; i<numStudents;i++){
            scores[i] = sc.nextInt();
        }

        int best = scores[0];
        for(int i = 1; i< scores.length;i++){
            if(scores[i] > best){
                best = scores[i];
            }
        }

        for(int i =0; i< scores.length;i++){
            char grade;
            if(scores[i] >= best-10){
                grade = 'A';
            }
            else if(scores[i] >= best - 20){
                grade = 'B';
            }
            else if(scores[i] >= best - 30){
                grade = 'C';
            }
            else if(scores[i] >= best - 40){
                grade = 'D';
            }
            else{
                grade = 'F';
            }

            System.out.println("Student "+ i+ " score is "+scores[i]+ " and grade is "+grade);
        }

    }
}
