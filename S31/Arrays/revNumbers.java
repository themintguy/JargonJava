package Arrays;

import java.util.Scanner;

public class revNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        long num = sc.nextLong();
        long rev = 0;

        while(num != 0){
            long digit = num %10;
            rev = rev*10+digit;
            num /= 10;
        }
        System.out.println("Rev num: "+ rev);
    }
}
