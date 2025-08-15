import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,5,6,545,756,963,978,990,997};
        System.out.print("Enter item to search : ");
        int n=sc.nextInt();
        int low=0,high=a.length-1,mid=0,index=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(a[mid]==n){
                index=mid;
                break;
            }
            else if(a[mid]<n){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(index==-1){
            System.out.println("Item not found");
        }
        else{
            System.out.println("Item found at index "+index);    
        }
        sc.close();
    }
}