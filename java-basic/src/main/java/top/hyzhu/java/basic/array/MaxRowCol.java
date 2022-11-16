package top.hyzhu.java.basic.array;

public class MaxRowCol {
    public static void main(String[] args) {
        int [][]a=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j]=(int)(Math.random( )*2);
                System.out.print(a[i][j]);
            }
            System.out.println( );
        }
        int largest_row = 0;
        int count_row = 0;
        int temp_row = 0;
        for (int i = 0 ; i < 4 ; i++){
            temp_row = 0;
            for (int j = 0 ; j < 4; j++){
                if (a[i][j] == 1){
                    temp_row++;
                }
            }
            if (count_row < temp_row){
                count_row = temp_row;
                largest_row = i;
            }
        }
        int largest_col = 0;
        int count_col = 0;
        int temp_col = 0;
        for (int j = 0 ; j < 4 ; j++){
            temp_col = 0;
            for (int i = 0 ; i < 4; i++){
                if (a[i][j] == 1){
                    temp_col++;
                }
            }
            if (count_col < temp_col){
                count_col = temp_col;
                largest_col = j;
            }
        }
        System.out.println("The largest row index: " + largest_row);
        System.out.println("The largest column index: " + largest_col);
    }
}
