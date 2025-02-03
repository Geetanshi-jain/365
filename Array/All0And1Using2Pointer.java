package Array;

public class All0And1Using2Pointer {
    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l]; // Fixing the swap logic
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public int[] SortZeroesAndOnes(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (arr[l] == 0 && l < r)
                l++;
            while (arr[r] == 1 && l < r)
                r--;
            if (l < r) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        All0And1Using2Pointer a = new All0And1Using2Pointer();
        int arr[] = { 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0 };
        int ans[] = a.SortZeroesAndOnes(arr);
        for (int e : ans) {
            System.out.print(e + " "); // Print in a single line for better readability
        }
        System.out.println("\nhello");
    }
}
