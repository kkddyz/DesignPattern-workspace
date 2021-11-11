package homework.abstractFactory.components;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 文本框
 */
public class TextBox {
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

    public TextBox(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println("这是"+color+"颜色的文本框");
    }
}
