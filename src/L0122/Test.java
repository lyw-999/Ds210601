package L0122;

public class Test {
    public static void main(String[] args) {
        Animal an = new Animal();


        Animal nn=new Animal("灰色的一只","Dog");

        System.out.println(nn.color+nn.name);
        String tz = an.name;
        String c = an.color;

        System.out.println("名字是"+tz+"颜色是"+c);
        System.out.println(an.name+an.height+an.color+an.weight);

        an.eat(3);
        an.run(3);



    }


}
