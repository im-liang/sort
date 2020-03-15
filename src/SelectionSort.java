import java.util.Arrays;

class SelectionSort {

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
     * runtime: O(n^2)
     * space: O(1)
     *
     * @param a
     */
    public static void sort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}