// These questions are taken from JAVAPOINT.COM website 
// 1) Program to copy all the elements of one array into another array 

public class Problem1{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i]; // here i copy the element of arr1 to arr2
        }


        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " "); // here the copied element will be printed
        }
        
    }

    
}