package homework.builder.components;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 按钮
 */
public class Button extends MyComponent {
    /**
     * 内容
     */
    private String content;

    public Button(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("这是一个按钮,内容为:" + content);
    }
}
