package L0122;

public class Animal {
    String name ="小狗";
    String height = "15cm";
    String color = "黑色";
    String weight = "15kg";

    void eat(int count){
        for (int i =1;i<= count;i++){
            System.out.println("现在是吃饭"+i);
        }

    }
    void run(int count){
        for (int i = 1; i <= count; i++) {
            System.out.println("吃完跑"+i+"跑");
        }

    }

    //构造方法 无参
    public  Animal(){
        System.out.println("无参构造方法 -----");
        this.name="兔子";
        this.color="白色";
    }

    public  Animal(String cc,String name){
        this.color=cc;
        this.name= name;
        System.out.println("有参构造方法 -----");
    }
}
