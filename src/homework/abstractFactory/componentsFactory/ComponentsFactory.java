package homework.abstractFactory.componentsFactory;

import homework.abstractFactory.components.Button;
import homework.abstractFactory.components.ComboBox;
import homework.abstractFactory.components.TextBox;

/**
 * The interface Components factory.
 *
 * @author kkddyz  <p> 组件工厂，定义创建组件的方法
 */
public interface ComponentsFactory {

    Button createButton();

    ComboBox createComboBox();

    TextBox createTextBox();

}
