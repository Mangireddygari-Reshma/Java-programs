import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        int a[]={10,6,7,4,6,2,1,5,8};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.print("Sorted Array : ");
        System.out.println(Arrays.toString(a));
    }
}

