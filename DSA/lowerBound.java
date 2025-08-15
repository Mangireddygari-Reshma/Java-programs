import java.util.*;
public class lowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,8,9,10,11,12,23,45,67,87,98,123};
        int n = sc.nextInt();
        int lo=0;
        int hi=a.length-1;
        int ans = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(a[mid]>=n){
                hi = mid-1;
                
                ans = mid;
            }
            else if(a[mid]<n){
                lo = mid+1;
            } 
            ans=mid;
            
        }
        System.out.println(ans);
        sc.close();
    }
}
