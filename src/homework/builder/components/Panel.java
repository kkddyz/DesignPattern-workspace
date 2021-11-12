package homework.builder.components;

import java.util.ArrayList;

/**
 * @author kkddyz
 * @date 2021/11/12
 * @description
 */
public class Panel {

    private Button button;
    private TextField textField;
    private Label label;

    private ArrayList<MyComponent> components;

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public ArrayList<MyComponent> getComponents() {
        return components;
    }

    public Button getButton() {
        return button;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setComponents(ArrayList<MyComponent> components) {
        this.components = components;
    }

    public Label getLabel() {
        return label;
    }

    public void display(){
        System.out.println("display panel");
        for (MyComponent component : components) {
            component.display();
        }
        System.out.println("end-----------------------");
    }
}
