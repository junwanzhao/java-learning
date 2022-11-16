package top.hyzhu.java.basic.array;

public class BubblingCycle {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 36, 26, 2, 46, 4, 19, 50, 48};
        //外层循环控制排序趟数
        for (int i = 0; i < arr.length - 1; i++){
            //内层循环控制每一趟排序多少次
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是：");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
