package homework.singleton;

/**
 * @author kkddyz
 * @date 2021/11/19
 * @description
 */

/**
 * 单例类，月亮
 *
 * @author kkddyz
 */
public class Moon {
    private static Moon moon;
    private static final double RADIUS = 1738.0;
    private static final double DISTANCE = 363300.0;

    private Moon() {
        System.out.println("invoke Moon private Constructor");
    }

    public static Moon getMoon() {
        if (moon == null) {
            moon = new Moon();
        } else {
            System.out.println("已经创建好了唯一的Moon");
        }
        return moon;
    }

    public void print() {
        System.out.println("月亮的半径是" + RADIUS + "km，距地球" + DISTANCE + "km");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
