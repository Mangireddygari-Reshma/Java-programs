import java.util.*;
class helloWorld{
    static int sum(int a,int b){
        return a+b;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int answer=sum(a,b);
        System.out.println(answer);
        sc.close();
    }
}
