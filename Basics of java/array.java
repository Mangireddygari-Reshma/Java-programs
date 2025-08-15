import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        System.out.print("Enter Array Length: ");
            double len=sc.nextDouble();
        for(int i=0;i<len;i++){
            System.out.print("Enter Array Element "+(i+1)+": ");
            double inp=sc.nextDouble();
            sum+=inp;
        }
        System.out.println("Length of array is "+len);
        System.out.println("Sum of array is "+sum);
        double mean=sum/len;
        System.out.println("Mean of the Array is "+mean);
        sc.close();
    }
}