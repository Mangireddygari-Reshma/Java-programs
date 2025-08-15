import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
        sc.close();
    }

    static int fibo(int n){
        if (n<=1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
