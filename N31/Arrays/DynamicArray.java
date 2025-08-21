package Arrays;

public class DynamicArray {

    int capacity;
    int length;
    int[] arr;

    public DynamicArray(){
        capacity = 2;
        length = 0;
        arr = new int[2];
    }

    public void pushBack(int n){
        if(length == capacity){
            this.reSize();
        }
        arr[length] = n;
        length++;
    }

    public void reSize(){
        capacity = 2*capacity;
        int[] newArr = new int[capacity];

        for(int i =0; i<length;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void popBack(){
        if(length > 0){
            length--;
        }
    }

    public int get(int i){
        if(i < length){
            return  arr[i];
        }

        return  -1;
    }

    public void print(){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
