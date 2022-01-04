--------------Imporatant--------------
// 2) Program to find the frequency of each element of an array 

public class Problem2 {
    public static void main(String[] args) {
        //Initialize array   
        int[] arr1 = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array arr2 will store frequencies of element  
        int[] arr2 = new int[arr1.length];
        int alreadyVisited = -1;
        int count = 1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if(arr1[i] == arr1[j]){
                    count++;
                    arr2[j] = alreadyVisited;
                }
            }
            if(arr2[i] != alreadyVisited){
                arr2[i] = count;
            }
        }
        for(int i = 0; i <arr2.length;i++){
            if (arr2[i] != alreadyVisited) {
                System.out.println(arr1[i] + "  -  " +arr2[i]);
            }
            
        }
    }
}
