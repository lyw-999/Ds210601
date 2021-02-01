package L0120;

import L0120.Work.WorkDay;

public class Work1 {
    public static void main(String[] args) {

        WorkDay day = Work.WorkDay.Work;

        switch (day){
            case Work:;
            System.out.println("周一上班");
            break;
            case Work1:
                System.out.println("周二上班");
                break;
            case Work2:
                System.out.println("周三上班");
                break;
            case Work3:
                System.out.println("周四上班");
                break;
            case Work4:
                System.out.println("周五上班");
                break;
            case Work5:
                System.out.println("周六上班");
                break;
            case Rest:
                System.out.println("周日上班");
                break;

        }
    }
}
