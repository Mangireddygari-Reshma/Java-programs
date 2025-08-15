import java.util.Scanner;
//solution1:equalate left and right sum using forloops
//solution2: prefix sum (pre-computational Technique)
public class equilibriumIndex {

    static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array : ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left=0;
        int right=sum(arr);
        int d=-1;

        for (int i=0;i<arr.length;i++){
            right-=arr[i];
            if(right==left){

                d=i;
                break;
            }
            left+=arr[i];
        }

        System.out.println("Equilibium Index is : "+d);
        sc.close();
    }
    
}
