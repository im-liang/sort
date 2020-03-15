import java.util.Arrays;

public class MergeSort {
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


    /**
     * runtime: O(nlogn)
     * space: O(n)
     *
     * @param a
     */
    public static void sort(int[] a) {
        int len = a.length;
        if(len <= 1) return;
        int[] left = new int[len / 2];
        int[] right = new int[len - len / 2];
        for(int i = 0; i < len / 2; i++) {
            left[i] = a[i];
        }
        for(int i = len / 2; i < len; i++) {
            right[i - len / 2] = a[i];
        }
        sort(left);
        sort(right);
        merge(a, left, right, len / 2, len - len / 2);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right) {
            if(l[i] <= r[j]) a[k++] = l[i++];
            else a[k++] = r[j++];
        }
        while(i < left) a[k++] = l[i++];
        while(j < right) a[k++] = r[j++];
    }
}
