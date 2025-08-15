import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        int a[]={10,6,7,4,6,2,1,5,8};
        int n=a.length;
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
}
