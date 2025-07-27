public class subArray {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4};

        for( int start = 0; start < arr.length; start++){
            for(int end = start; end < arr.length; end++){
                System.out.println( " Sub arr ");
                for(int i = start ; i<end;i++){
                    System.out.println(arr[i]);
                }
            }

            System.out.println(" ****************** FIRSRT LOOP OVER");
        }
    }
}
