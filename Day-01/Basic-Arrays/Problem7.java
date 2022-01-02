
// Copying the first arrays element to the another array 

public class Problem7 {
    public static void main(String[] args) {
        int []arr = {8,6,10,9,2,15,7,13,14,11};
        int []storearr = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            storearr[i] = arr[i]; 
        }
        for(int i = 0; i<storearr.length;i++){
            System.out.print(storearr[i] + " ");
        }
     }
}
