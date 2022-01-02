// import java.nio.channels.FileChannel.MapMode;

// Qst. find the second maximum element in an array 

public class Problem6 {
    public static void main(String[] args) {
        int[] arr = {5,9,6,10,12,7,3,5,4,2};
        int max1;
        int max2;

        max1 = max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1; // copy the max1 element in max2
                max1 = arr[i]; // then we will store the max elment in an array in max1
            }

            else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
