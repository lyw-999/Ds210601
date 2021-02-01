package L0111;

public class Main1 {
    public static void main(String[] args) {
        //自动转换类型  从小到大      byte  -short 转  int - long - float - double;
        //                                char 转
        int a = 100;
        float b = a;
        System.out.println(b);

        // 强制类型转换  从大到小       double - float - long - int   转  short/char  --byte
        double db = 3.14;
        /*
        *强转数据类型转换
        * 格式
        * 目标数据类型 变量名 =(目标数据类型) 需要转换的值  存在数据丢失问题
        * */

        int i = (int)db;
        System.out.println(i);
    }
}
