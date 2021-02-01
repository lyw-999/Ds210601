package L0113;

public class Test {
    public static void main(String[] args) {
    //赋值运算符  把右边的结果赋给左边的变量
        int a =10;
        int b = 5;
        a += b; //a =15
        a -= b; //a =5
        a *= b; //a =50
        a /= b; //a =2
        a %= b; //a = 0;

    //算数运算符 + - * / %
        /*
        int c=15,d=5;
        int e=0;
        e = c+d; e=15
        e = c-d; e=10
        e = c*d; e=75
        e = c/d; e=3
        e = c%d; e=0
        */

    //自增自减运算符
        // ++a a++ --a a-- ＋号在前 先加一再赋值 +号在后 先赋值在加一
         //  int a =10;
        // int b = a++; b=10 a=11
        // int b = ++a; b=11 a=10

    //关系运算符
        // int a =10, b=11;
  //  boolean  rl = a < b;
       // System.out.println(rl);true

    //逻辑运算符
        boolean z = true;
        boolean x = false;
        // 逻辑与
    //   System.out.println(z & x);  F
        // 短路逻辑与
    //    System.out.println(z && x); F
        // 逻辑或
    //  System.out.println(z | x);  T
        // 短路逻辑或
    //   System.out.println(z || x); T


    //三元运算符
        // int a=10,b=20;
        //  int c = a > b ? 1 : 2 a与b相比较 true输出1 false输出2
     //   System.out.println(c);// 2

    //位运算符
        /*
        int a = 3; //二进制 0 0 1 1
        int b = 6; //二进制 0 1 1 0
        进行与运算，二进制 0 0 1 0 = 十进制的 2
        int result = a & b;
        System.out.println(result);
        */

    //移位运算符
     //   int a = 3 >> 1;
        // 3 的二进制 0 0 1 1
        //左边移动 1 位 0 1 1 0 = 十进制的 6
      //  System.out.println(a);
    }
}
