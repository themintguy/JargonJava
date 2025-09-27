package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter numbers ");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Key; "+entry.getKey()+ " , Value "+entry.getValue());
        }
    }
}