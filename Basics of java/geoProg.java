import java.util.Scanner;

public class geoProg {

    static double sum(int n){
        if(n==1){
            return 0.5;
        }
        else{
            return (double)(1/Math.pow(2,n))+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(sum(number));
        sc.close();
    }
}
