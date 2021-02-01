package L0118;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {

        //静态初始化一个三维数组
        int[] [] [] arr= {{{1, 2, 3}, {2, 3, 4}, {3, 4, 5}}};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[0][2]));

        System.out.println(arr[0][0][1]);//2
        System.out.println(arr[0][1][2]);//4

        //动态初始化三维数组
        int[][][] arr1 =new int[3][3][3];
        arr1[0][0][0]= 10;
        arr1[0][1][1]= 20;
        arr1[0][2][2]= 30;
        System.out.println(arr1[0][1][1]);//20
        System.out.println(arr1[0][2][2]);//30


        int[][][] arrr = new int[][][]{
         {{1,2,3},{4,5,6},},
          {{7,8,9},{10,11,12},
          },
        };
        //遍历 普通for循环
        System.out.println("普通for循环");
        for (int i=0;i<arrr.length;i++) {
         //   System.out.println("三维数组的第"+(i+1)+"个元素是一个"+arrr[0].length+"维数组，内容如下：");
            for(int j=0;j<arrr[i].length;j++){
                for(int b=0;b<arrr[0][0].length;b++){
                    System.out.print(arrr[i][j][b]+"\t");
                }
                System.out.println();
            }
        }

        //遍历 增强for循环
        System.out.println("增强for循环");
        for ( int[][] aa:arrr) {
            for(int[] i:aa){
                for(int a : i){
                    System.out.print(a +"\t");
                }
                System.out.println();
            }
        }

    }
}
