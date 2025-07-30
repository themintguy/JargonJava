public class Linear {
    public static void main(String[] args) {
        int arr[]={1,3,49,23,4,5};
        int key =500;
        System.out.println(LinearSearch(arr, key));
    }
    public static int LinearSearch(int arr[],int key){
           for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
           }
           return -1;
    }

}