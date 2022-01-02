
// Qst. Increasing size of an Array 

public class Problem9 {
    public static void main(String[] args) {
        int[] arr = {11,6,10,9,2};
        System.out.print(+arr.length);

        int[] ans = new int[10];
        for(int i = 0;i<arr.length;i++){
            ans[i] = arr[i];
        }

        arr = ans;
        System.out.print(+arr.length);
    }
}
