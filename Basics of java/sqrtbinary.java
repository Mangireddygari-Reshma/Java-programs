import java.util.Scanner;
public class sqrtbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        int n = sc.nextInt();
        int low = 0;
        int high = n;
        while (low<high) {
            int mid = (low + high) / 2;
            if (mid*mid==n){
                ans=mid;
            }
            else if (mid * mid < n) {
                ans=mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
