import java.util.*;
public class mergeSort {
    public static void mergeSor(int[] a, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSor(a, l, mid);
            mergeSor(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }
    public static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = a[mid + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;    
        }
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        mergeSor(a, 0, n - 1);
        System.out.println("Sorted array: " + Arrays.toString(a));
        sc.close();
    }
}
