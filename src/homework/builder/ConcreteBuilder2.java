package homework.builder;

import homework.builder.components.*;

import java.util.ArrayList;

/**
 * @author kkddyz
 * @date 2021/11/12
 * @description
 */
public class ConcreteBuilder2 implements MyFrameBuilder {
    private Panel panel;


    public ConcreteBuilder2( ) {
        this.panel = new Panel();
    }

    @Override
    public void buildButton() {
        panel.setButton(new Button("button"));
    }

    @Override
    public void buildLabel() {
        panel.setLabel(new Label("label"));
    }


    @Override
    public void buildTextField() {
        panel.setTextField(new TextField("textField"));
    }

    @Override
    public Panel buildMyFrame() {
        ArrayList<MyComponent> components = new ArrayList<>();
        components.add(panel.getTextField());
        components.add(panel.getLabel());
        components.add(panel.getButton());
        panel.setComponents(components);
        return panel;
    }

}
