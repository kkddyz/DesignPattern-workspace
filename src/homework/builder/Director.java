package homework.builder;

import homework.builder.components.Panel;

/**
 * @author kkddyz
 * @date 2021/11/12
 * @description
 */

public class Director {
    private MyFrameBuilder builder;

    public Director(MyFrameBuilder builder) {
        this.builder = builder;
    }

    public Panel constructProduct() {
        builder.buildButton();
        builder.buildLabel();
        builder.buildTextField();
        Panel panel = builder.buildMyFrame();
        return panel;
    }
}
