import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int a[]={10,6,7,4,6,2,1,5,8};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        System.out.println(Arrays.toString(a));
    }
}