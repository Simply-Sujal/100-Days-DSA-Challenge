
// 3. Program to left rotate the elements of an array.

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // int temp = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     arr[i-1] = arr[i];
        // }
        // arr[arr.length - 1] = temp;
        // for (int leftrotation : arr) {
        //     System.out.print(leftrotation + " ");
        // }

        // -------------XXX------XXX-------XXX-----------

        // n tells you the number of array rotated 
        int n = 3;
        int first = arr[0];// stores the first element of an array 
        int j; 
        
        for(int i = 0;i<n;i++){ //Rotate the given array by n times toward left  
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j+1]; // shift element of array by one 
            }
            //First element of array will be added to the end  
            arr[j] = first; 
        }

        //Displays resulting array after rotation
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }   
}
