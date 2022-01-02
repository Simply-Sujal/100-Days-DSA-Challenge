
// Inserting an Element an array 

public class Problem3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 12;
        arr[4] = 46;
        arr[5] = 78;

        int n = 6;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int x = 100;
        int index = 2;

        for(int i = n; i>index;i--){
            arr[i] = arr[i-1];
            arr[index] = x;
        }

        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
            // System.out.println();
        }

    }
}
