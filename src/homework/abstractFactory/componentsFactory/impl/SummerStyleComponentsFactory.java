package homework.abstractFactory.componentsFactory.impl;

import homework.abstractFactory.components.*;
import homework.abstractFactory.componentsFactory.ComponentsFactory;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 创建Summer风格的组件
 */
public class SummerStyleComponentsFactory implements ComponentsFactory {
    @Override
    public Button createButton() {
        return new SummerStyleButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerStyleComboBox();
    }

    @Override
    public TextBox createTextBox() {
        return new SummerStyleTextBox();
    }
}
