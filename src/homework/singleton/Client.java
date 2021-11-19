package homework.singleton;

/**
 * @author kkddyz
 * @date 2021/11/19
 * @description 测试类
 */
public class Client {
    public static void main(String[] args) {
        Moon moon1 = Moon.getMoon();
        System.out.println("打印moon1信息");
        moon1.print();
        System.out.println("-----------------------------------------");


        Moon moon2 = Moon.getMoon();
        System.out.println("打印moon2信息");
        moon2.print();
        System.out.println("-----------------------------------------");

        System.out.println("比较moon1,moo2是否相同");
        boolean equals = moon1.equals(moon2);
        System.out.println("调用equals(),结果为"+equals);
    }
}
