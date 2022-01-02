
// Reverse copying an array 

public class Problem8 {
    public static void main(String[] args) {
        int[] arr = {8,6,10,9,2,15,7,13,14,11};
        // int[] ans = new int[arr.length];
        
        System.out.print("The reverse of an array is : ");
        for(int i = arr.length-1;i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
