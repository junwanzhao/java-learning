package top.hyzhu.java.tool.array;

public class ArrayTools {
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i =1;i <arr.length;i++){
          if(arr[i] >max){
            max =arr[i];
          }
        }
        return max;
    }
}
