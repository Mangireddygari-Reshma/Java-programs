
import java.util.Scanner;

public class primeCheck {

    static String Check(int n){
        int count=0;
        for(int i=2; i<=n/2;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if (count==0){
            return "YES";
        }
        else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Check(n));
        sc.close();
    }
}
