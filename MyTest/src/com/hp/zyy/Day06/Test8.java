package com.hp.zyy.Day06;

import java.util.HashMap;
import java.util.Map;

public class Test8 {
    public static void main(String[] args) {
        Map<String, String > map1 = new HashMap<String, String >();
        map1.put("username", "贝利亚");
        map1.put("age", "1000");
        Atm atm = new Atm();
        atm.setUsername(map1.get("username"));
        atm.setAge(map1.get("age"));
        System.out.println("atm = " + atm);
    }
    static class Atm{
        private String username    ;
        private String age;

        @Override
        public String toString() {
            return "Atm{" +
                    "username='" + username + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
