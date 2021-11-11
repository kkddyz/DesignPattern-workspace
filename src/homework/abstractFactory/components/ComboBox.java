package homework.abstractFactory.components;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 组合框
 */
public class ComboBox {
    /**
     * 颜色
     */
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ComboBox(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println("这是"+color+"颜色的组合框");
    }
}
