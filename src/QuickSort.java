import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] test1 = new int[] {8,3,6,7,2,4,5};
        sort(test1);
        System.out.println(Arrays.toString(test1));
        int[] test2 = new int[] {8,7,6,5,4,3,2};
        sort(test2);
        System.out.println(Arrays.toString(test2));
        int[] test3 = new int[] {1,2,3,4,5,6,7,8,9};
        sort(test3);
        System.out.println(Arrays.toString(test3));
        int[] test4 = new int[] {1,1,1,1};
        sort(test4);
        System.out.println(Arrays.toString(test4));
    }

    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int left, int right) {
        if(right <= left) return;
        int pivot = partition(a, left, right);
        quickSort(a, left, pivot - 1);
        quickSort(a, pivot + 1, right);
    }

    private static int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int i = (left - 1);
        for (int j = left; j<right; j++) {
            if (a[j] < pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[right];
        a[right] = temp;

        return i+1;
    }
}
