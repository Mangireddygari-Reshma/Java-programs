import java.util.Scanner;

public class area {
    static void triangle(int a,int b){
        double area=1/2*(a*b);
        System.out.println("Area of Triangle is "+area);
    }
    static void rectangle(int a,int b){
        double area=a*b;
        System.out.println("Area of Rectangle is "+area);

    }
    static void square(int a,int b){
        double area=a*a;
        System.out.println("Area of Square is "+area);

    }
    static void circle(int a,int b){
        double area=3.14*a*a;
        System.out.println("Area of Circle is "+area);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();

        triangle(a,b);
        square(a,b);
        rectangle(a,b);
        circle(a,b);

        sc.close();
    }
}
