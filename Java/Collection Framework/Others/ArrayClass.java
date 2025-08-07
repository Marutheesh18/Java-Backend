import java.util.Arrays;

public class ArrayClass{

    public static void main(String[] args) {
        
        int[] numbers= {1,2,3,4,5,6,7,8,9};

        int index=Arrays.binarySearch(numbers, 4);

        System.out.println("The index of 4th element is "+ index);

        Integer[] arr= {10,2,32,12,15,76,17,48,79};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        //Arrays.toString(arr): Converts the array to a string representation for printing.

        for(Integer i:arr){
            System.out.println(i+" ");
        }

        Arrays.fill(arr,10);
        System.out.println(Arrays.toString(arr));
    }
}