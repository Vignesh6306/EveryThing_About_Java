import java.util.*;

public class Duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        System.out.println("The duplicate value : ");
        for(int i=0; i<n; i++){
            boolean duplicate = false;

            for(int j=0; j<count; j++){
                if(a[i] == b[j]){
                    duplicate = true;
                    break;
                }
            }
            
            if(duplicate){
                System.out.print(a[i] + " ");
            } else{
                b[count] = a[i];
                count++;
            }
        }
        System.out.println();
        System.out.println("Without duplicate :");
        for(int i=0; i<count; i++)
            System.out.print(b[i] + " ");
    }
}
