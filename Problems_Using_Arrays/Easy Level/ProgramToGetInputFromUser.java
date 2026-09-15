import java.util.*;

class ProgramToGetInputFromUser{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();
            if(arr[i] %2 == 0)
                evenCount++;

            if(arr[i] %2 != 0)
                oddCount++;
        }

        System.out.print("The entered inputs are : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Even Count : " + evenCount);

        System.out.println("Odd Count : " + oddCount);

        int total = evenCount + oddCount;
        System.out.println("Total Elements : " + total);
    }
}