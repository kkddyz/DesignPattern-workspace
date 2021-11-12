package homework.builder;

import homework.builder.components.Panel;

/**
 * @author kkddyz
 * @date 2021/11/12
 * @description
 */
public interface MyFrameBuilder {
    void buildButton();

    void buildLabel();

    void buildTextField();

    Panel buildMyFrame();
}
