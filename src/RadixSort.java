import java.util.Arrays;

public class RadixSort {

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

    public static void countingSort(int arr[], int exp) {
        int len = arr.length;
        int output[] = new int[len];
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        for (i = 0; i < len; i++)
            count[ (arr[i]/exp)%10 ]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = len - 1; i >= 0; i--) {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }

        for (i = 0; i < len; i++)
            arr[i] = output[i];
    }

    public static void sort(int[] a) {
        int max = (Arrays.stream(a).max().getAsInt());

        for (int place = 1; max / place > 0; place *= 10)
            countingSort(a, place);
    }
}
