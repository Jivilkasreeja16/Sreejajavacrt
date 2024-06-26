import java.util.*;

class firstHalf {
    static void bubbleSort(int a[], int n) {
        int halfLength = n / 2;
        if (n % 2 != 0) {
            halfLength++; 
        }
        
        
        for (int i = halfLength - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        bubbleSort(a, n);
        
        System.out.println("Sorted first half of the array:");
        int halfLength = n / 2;
        if (n % 2 != 0) {
            halfLength++;  
        }
        
        for (int i = 0; i < halfLength; i++) {
            System.out.print(a[i] + " ");
        }
        
        s.close();
    }
}
