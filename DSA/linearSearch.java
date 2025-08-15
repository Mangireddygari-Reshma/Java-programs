import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        int a[]={1,2,5,6,5455,9,3,78,90,7};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter item to search : ");
        int n=sc.nextInt();
        int index=-1;
        for (int i=0;i<a.length;i++){
            if(a[i]==n){
                index=i;
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
