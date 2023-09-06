//编号自增小案例
package sta.demo01;

public class StaDemo01 {
    public static void main(String[] args) {
        student s1 = new student("祛病",18);
        student s2 = new student("卫青",18);
        student s3 = new student("张骞",18);
        student s4 = new student("秦",18);
        student s5 = new student();
        s5.setName("韩信");
        s5.setAge(18);

        System.out.println(s1.print());
        System.out.println(s2.print());
        System.out.println(s3.print());
        System.out.println(s4.print());
        System.out.println(s5.print());
    }
}
