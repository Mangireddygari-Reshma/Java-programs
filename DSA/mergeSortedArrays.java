import java.util.*;
public class mergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element of array: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of array: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the element of array: ");
            b[i] = sc.nextInt();
        }
        int c[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        sc.close();
        System.out.println(Arrays.toString(c));
    }
}
