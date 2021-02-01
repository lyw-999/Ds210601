package L0118;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {


        // Arrays.sort 方法
        int[][][] array=new int[][][]{
                {{1,2,3},{4,5,6}},
                {{8,9,10},{11,12,13}},
                {{14,15,16},{17,18,19}},
        };
        //升序排序
        Arrays.sort(array[0][0]);
        System.out.println("最大值：" + array[array.length - 1][array.length - 2][array.length - 1]);
        System.out.println("最小值：" + array[0][0][0]);
   /*    for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){//遍历数组当中的每个元素，
                for(int k=0;k<array[0][0].length;k++){
                    System.out.print(array[i][j][k]+"\t");//将数组当中每个元素输出
                }
                System.out.println(" ");
            }
    }*/
    }
}