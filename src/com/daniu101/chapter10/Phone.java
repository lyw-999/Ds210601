package com.daniu101.chapter10;

public class Phone {
    private String brand;
    private Double size;
    private String statu;

    //提供给其他类访问的方法
    public Double getSize() {
        return size;
    }
    public String getStatu() {
        return statu;
    }
    //提供给其他类赋值的方法
    public void setSize(Double zt) {
        if (zt >= 0) {
            this.size = zt;
        } else {
            System.out.println("您输入的尺寸有误");
        }
    }
    public void setStatu(String s) {
        if (s == "正常") {
            this.statu = s;
        } else {
            System.out.println("您的手机状态错误");
        }
    }

    @Override
    public String toString() {
        return  "这是一个手机类 ";
    }
}
