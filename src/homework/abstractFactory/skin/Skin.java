package homework.abstractFactory.skin;

import homework.abstractFactory.components.Button;
import homework.abstractFactory.components.ComboBox;
import homework.abstractFactory.components.TextBox;
import homework.abstractFactory.componentsFactory.ComponentsFactory;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 使用组件创建, Skin不能被实例化。
 */
public abstract class Skin {
    private Button button;
    private ComboBox comboBox;
    private TextBox textBox;
    protected String skinName;

    /**
     * 抽象的好处就是被使用的时候保持一致。
     */
    private ComponentsFactory componentsFactory;

    /**
     * 使用组件工厂提供的组件创建对象,
     * 不能被实例化那么构造函数就没用了吗？
     * 不是的，可以用。
     * <p>
     * 我选择在Skin中就写好如何使用原料工厂的步骤
     * 这一部分可以移交到SpringSkin的子类中，但是我确定这是固定，所以直接写在父类中。
     */
    public Skin(ComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
        this.button = componentsFactory.createButton();
        this.comboBox = componentsFactory.createComboBox();
        this.textBox = componentsFactory.createTextBox();
    }

    /**
     * 展示皮肤库
     */
    public void display() {
        System.out.println("展示皮肤: "+skinName);
        button.display();
        comboBox.display();
        textBox.display();
    }
}
