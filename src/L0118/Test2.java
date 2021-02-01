package L0118;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        int[][][] arrr = new int[][][]{
                {{1,2,3},{4,5,6},},
                {{7,8,9},{10,11,12},
                },};
        int max =arrr[0][0][0];
        int min =arrr[0][0][0];
        //最小值
        for (int i=0;i<arrr.length;i++) {
            for(int j=0;j<arrr[i].length;j++){
                for(int b=0;b<arrr[0][0].length;b++){
                   if(min >arrr[i][j][b]){
                    min=arrr[i][j][b];
                   }
                }
                System.out.println();
            }
        }
        //最大值
        for (int i=0;i<arrr.length;i++) {
            for(int j=0;j<arrr[i].length;j++){
                for(int b=0;b<arrr[0][0].length;b++){
                    if(arrr[i][j][b] > max){
                       max=  arrr[i][j][b];
                    }
                }
                System.out.println();
            }
        }
        //最大最小值
        System.out.println(min);
        System.out.println(max);
        //拷贝数组
       /* int[][][] array = {
                {{1,3},{4,6},},
                {{7,9},{10,12},},
        };
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        int[][][] array1;
        array1 = array;
        System.out.println(array1);
        System.out.println(Arrays.toString(array1));*/

        //合并数组
     /*   int[][]  aa = new int[][]{{1,3,5,7,9},{2,4,6,8,10}};
        int[][] bb = new int[][]{{77,88}, {99,100}};

        int[] []all = new int[aa.length + bb.length][];
        //将 aa 拷贝到 all
        System.arraycopy(aa, 0, all, 0, aa.length);
        //将 bb 拷贝到 all
        System.arraycopy(bb, 0, all, aa.length,
                bb.length);

        System.out.println(Arrays.toString(aa[0]));
        System.out.println(Arrays.toString(bb[0]));
        System.out.println(Arrays.toString(new int[]{all[0][0]}));*/
    }
}
