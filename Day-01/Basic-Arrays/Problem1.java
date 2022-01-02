// qst. 1 Rotation of an array in leftward by one place 

public class Problem1{
    public static void main(String[] args) {
        int[] arr = {5,9,6,10,12,7,3,45,56};
        int temp = arr[0]; // make a temporary variable in which store a first value

        // run a loop to traverse an array
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp; // storing temp value at the end of the index

        // using for-each loop to print an array 
        for (int rotatedarray : arr) {
            System.out.print(rotatedarray + " ");
        }


    }
}