import java.util.Arrays;

public class BucketSort {
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
        int max = (Arrays.stream(a).max().getAsInt());
        int[] bucket = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            bucket[a[i]]++;
        }

        for (int i = 0, j = 0; i <= max; i++) {
            while (bucket[i] > 0) {
                a[j++] = i;
                bucket[i]--;
            }
        }
    }
}
