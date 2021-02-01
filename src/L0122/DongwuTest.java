package L0122;

public class DongwuTest {
    public static void main(String[] args) {
        Dongwu dw =new Dongwu();
        dw.height ="25cm";
        dw.color  ="黑色";
        dw.weight ="15kg";

        System.out.println(dw.height+dw.color+dw.weight);

            dw.eat();
            dw.run();
    }
}
