public class Binary {
    public static void main(String[] args) {
        int arr []={12,3,4,6};
        int key =6;
        System.out.println(BinarySearch(arr, key));
    }

    public static int BinarySearch(int arr[],int key){
        int s=0;
        int e=arr.length;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]==key){
                return m;
            }
            else if(arr[m]<key){
                s++;
            }
            else{
                e--;
            }
            
        }
        return -1;
    }
}