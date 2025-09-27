package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class printDistinctNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int[] distinctNumbers = new int[10];
        int count = 0;

        System.out.println("Enter 10 Numbers: ");

        for(int i = 0; i<10;i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i< 10;i++){
            boolean isDuplicate = false;

            for(int j = 0; j < count; j++){
                if(nums[i] == distinctNumbers[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                distinctNumbers[count] = nums[i];
                count++;
            }
        }
        System.out.println("The number of distinct numbers "+count);
        System.out.println("The distinct numbers are: ");
        for(int i = 0; i< count;i++){
            System.out.println(" "+distinctNumbers[i]);
        }
    }
}
