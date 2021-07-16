package com.hp.Day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test09 {
    /**
     * 要求用户输入若干员工信息，格式为：
     * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
     * 例如:
     * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
     * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
     * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
     * 然后输出每个员工的转正仪式日期。
     * 转正仪式日期为:入职3个月的当周周五
     *
     * @author Xiloer
     *
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入员工信息,格式为:name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;");
        System.out.println("例如:张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;");
        Scanner scanner = new Scanner(System.in);
         String sc = scanner.nextLine();
        String[] line = sc.split(";");
        List<Emp> list = new ArrayList<>();
        Calendar c =Calendar.getInstance();

        for(int i=0;i<line.length;i++){
            String[] arr = line[i].split(",");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String gender = arr[2];
            int salary = Integer.parseInt(arr[3]);

            Date hiredate = sdf.parse(arr[4]);

            Emp emps = new Emp(name,age,gender,salary,hiredate);
            list.add(emps);
        }
        for (Emp emp : list) {
            Date d = emp.getHiredate();
            c.setTime(d);
            c.add(Calendar.MINUTE, 3);
            c.set(Calendar.DAY_OF_WEEK, 6);
            System.out.println( "转正时间："+sdf.format(c.getTime()));
        }
    }
    static class  Emp{
        private String name;
        private int age;
        private String gender;
        private int salary;
        private Date hiredate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Date getHiredate() {
            return hiredate;
        }

        public void setHiredate(Date hiredate) {
            this.hiredate = hiredate;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", salary=" + salary +
                    ", hiredate=" + hiredate +
                    '}';
        }

        public Emp(String name, int age, String gender, int salary, Date hiredate) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.salary = salary;
            this.hiredate = hiredate;
        }
    }}
