package Arrays;

public class primeNumber {
    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 50;
        int[] primes = new int[NUMBER_OF_PRIMES];
        int count = 0;
        int number = 2;


        while(count < NUMBER_OF_PRIMES){
            boolean isPrime = true;

            for(int i =0; i<count;i++){
                if(primes[i] * primes[i] > number){
                    break;
                }
                if(number % primes[i] == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primes[count] = number;
                count++;
            }
            number++;

        }

        for(int i =0;i<NUMBER_OF_PRIMES;i++){
            System.out.printf("%5d",primes[i]);
            if((i+1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
