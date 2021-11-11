package homework.abstractFactory.componentsFactory.impl;


import homework.abstractFactory.components.*;
import homework.abstractFactory.componentsFactory.ComponentsFactory;

/**
 * @author kkddyz
 * 创建Spring风格的组件
 */
public class SpringStyleComponentsFactory implements ComponentsFactory {
    @Override
    public Button createButton() {
        return new SpringStyleButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringStyleComboBox();
    }

    @Override
    public TextBox createTextBox() {
        return new SpringStyleTextBox();
    }
}
