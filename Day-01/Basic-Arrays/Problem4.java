
// Rotation of an array leftward by one place 
public class Problem4{
    public static void main(String[] args) {
        int []arr = {5,9,6,10,12,7,3,5,4,2};
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    }
}