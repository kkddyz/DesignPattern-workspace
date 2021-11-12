package homework.builder;

import homework.builder.components.*;

import java.util.ArrayList;

/**
 * @author kkddyz
 * @date 2021/11/12
 * @description
 */
public class ConcreteBuilder1 implements MyFrameBuilder {
    private Panel panel;


    public ConcreteBuilder1() {
        this.panel = new Panel();
    }

    @Override
    public void buildButton() {
        panel.setButton(new Button("按钮"));
    }

    @Override
    public void buildLabel() {
        panel.setLabel(new Label("标签"));
    }


    @Override
    public void buildTextField() {
        panel.setTextField(new TextField("文本框"));
    }

    /**
     * 组装顺序
     */
    @Override
    public Panel buildMyFrame() {
        ArrayList<MyComponent> components = new ArrayList<>();
        components.add(panel.getButton());
        components.add(panel.getLabel());
        components.add(panel.getTextField());
        panel.setComponents(components);
        return panel;
    }

}
