package com.hp.collection;
                            // 泛型 必须要加 因为要做对比
public class Person implements Comparable<Person>{
    private  String name;
    private  int heigth;
    private  int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", heigth=" + heigth +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 此接口实现的是 比较接口  compare
//    @Override
//    public int compareTo(Person o) {
//        // 如果 return的返回值 大于0  就说明自身大于 被比较对象
//        // 目前按 身高排序
//        int x = this.getHeigth() - o.getHeigth();
//        return x;
//    }
//                                @Override
//                                public int compareTo(Person o) {
//                                    // 如果 return的返回值 大于0  就说明自身大于 被比较对象
//                                    // 目前按 身高排序
//                                    int x = o.getAge() - this.getAge();
//                                    return x;
//                                }
    @Override
    public int compareTo(Person o) {
        // 如果 return的返回值 大于0  就说明自身大于 被比较对象
        // 目前按 身高排序
        int x = o.getName().length() - this.getName().length();
        return x;
    }
}
