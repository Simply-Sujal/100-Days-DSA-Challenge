
// qst 2. Rotation of an array in the right side by one place 

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {5,9,6,10,12,7,3,45,56};
        int temp = arr[arr.length - 1]; // stored a last value in a temp variable

        for(int i=arr.length-2;i>=0;i--){
            arr[i+1] = arr[i];
        }

        arr[0] = temp;

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
