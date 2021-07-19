package com.hp.date;

import java.util.Calendar;

/*
    日历类: 可以做 日期的计算。
    使用场景，心目中: 预约功能 日期计算功能
    常用的APP  美柚  疫苗预约 入职日期计算 旅游预订
    对象如果不能被(无参) new: 1)无参构造私有化了 可能是单例模式
                          2) 该类可能是个 接口/抽象类 必须 new 它的 实现类(子类)
     */
public class Calendar01 {
        public static void main(String[] args) {
            // 创建对象 不仅仅只有new ，还有 类的实例方法
            //  calendar 功能上包含了 date的大部分功能  是date的升级版
            Calendar calendar = Calendar.getInstance();
            System.out.println("calendar = " + calendar);
            // 日历可以进行计算  比如 增加 add
            // 增加年份  增加十年  场景:买保险 纪念日
            //calendar.add(Calendar.YEAR,10);
            //System.out.println("calendar = " + calendar.getTime());
            //增加月份          增加一月
            //  calendar.add(Calendar.MARCH, 1);
            //增加天数         增加 10天
            //  calendar.add(Calendar.DATE,10);
            //减去 1天
            //  calendar.add(Calendar.DATE,-1);
            // 比如 设置当周的周五日期
            //  calendar.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
            System.out.println("calendar.getTime() = " + calendar.getTime());
            //还能 计算每个月份的最大值                         求月底的时间
            int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("days = " + days);  //31 天
            //查询今年 过了多少天
            int i = calendar.get(Calendar.DAY_OF_YEAR);
            System.out.println("i = " + i);
            // 查询今天是周几  国外的日历 从 周日开始
            int i1 = calendar.get(Calendar.DAY_OF_WEEK)-1;
            System.out.println("今天是周" + i1);
            // 今天是 周三
            String[] week = {"周日","周一","周二","周三","周四","周五","周六"};
            int i2 = calendar.get(Calendar.DAY_OF_WEEK)-1;
            System.out.println("今天是" + week[i2]);
            //  获取 月份 要+1
            int i3 = calendar.get(Calendar.MONTH)+1;
            System.out.println("现在是" + i3+"月");
            // 日历 set...
            calendar.set(Calendar.YEAR,2008);
            System.out.println("calendar = " + calendar);
            calendar.set(Calendar.MONTH,Calendar.MAY); // 月份从0开始
            System.out.println("calendar = " + calendar.getTime());
        }
}
