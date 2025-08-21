package Arrays;

public class Entry {
    public static void main(String[] args) {
        StaticArray sa = new StaticArray();
        DynamicArray da = new DynamicArray();
//        staticArray(sa);
        dynamicArray(da);



    }

    private static void dynamicArray(DynamicArray da){
        da.pushBack(3);
        da.pushBack(6);
        da.pushBack(9);
        da.pushBack(30);
        da.print();


        da.popBack();
        for(int i = 9; i <27;i = i+=3){
            da.pushBack(i);
        }


        da.print();
    }

    private  static void staticArray(StaticArray sa){
        int capacity = 10;
        int[] arr = new int[capacity];
        int length = 0;


        String MSG = "STATIC ARRAY";
        System.out.println(MSG);

        sa.printArr(arr,length);
        sa.insertEnd(arr,3,length,capacity);
        length++;
        sa.insertEnd(arr,6,length,capacity);
        length++;
        sa.insertEnd(arr,12,length,capacity);
        length++;
        sa.printArr(arr,length);


        sa.insertMiddle(arr,2,9,length);
        length++;
        sa.printArr(arr,length);


        sa.removeEnd(arr,length);
        sa.printArr(arr,length);

        sa.removeMiddle(arr,2,length);
        sa.printArr(arr,length);

    }
}
