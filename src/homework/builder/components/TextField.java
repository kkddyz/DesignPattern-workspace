package homework.builder.components;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 文本框
 */
public class TextField extends MyComponent{
    /**
     * 内容
     */
    private String content;

    public TextField(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("这是一个文本框,内容为:" + content);
    }
}
