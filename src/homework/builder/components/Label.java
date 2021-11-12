package homework.builder.components;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 标签
 */
public class Label extends MyComponent{
    /**
     * 内容
     */
    private String content;

    public Label(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("这是一个标签,内容为:" + content);
    }
}
