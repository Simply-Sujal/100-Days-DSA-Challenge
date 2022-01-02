
// Rotation of an array in rightward side by 1 place or 1 location 

public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {5,9,6,10,12,7,3,5,4,2};
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    }
}
