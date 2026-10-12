import java.util.*;

public class Max_and_Min {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];
        
        for(int i=1; i<n; i++){
            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        int maxCount = 0;
        int minCount = 0;

        for(int x : arr){
            if(x == max)
                maxCount++;

            if(x == min)
                minCount++;
        }

            System.out.println("The maximum element in the array is : " + max);
            System.out.println("The minimum element in the array is : " + min);

            System.out.println("The maximum count : " + maxCount);
            System.out.println("The minimum count : " + minCount);

    }
}
