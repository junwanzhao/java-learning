package top.hyzhu.java.basic.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,6,7,9};
        int i = search(arr, 1, 0, arr.length - 1);//(0 , 4)
        System.out.print(i);
    }
    public static int search(int[] arr, int target, int min, int max) {
        if(min > max || max < min) {
            return -1;
        }
        while(min <= max) {
            int mid = (min + max) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                min = mid + 1;
            }else if(arr[mid] > target) {
                max = mid - 1;
            }else {
                return -1;
            }
        }
        return -1;
    }
}
