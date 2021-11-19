package homework.proportyoe;

import javax.swing.*;
import java.awt.*;

public class Client {

    // 仅仅是封装拷贝的代码
    static private Picture clonePicture(Picture picture,MyClone cloneImpl) {
        return (Picture) cloneImpl.clone(picture);
    }



    public static void main(String[] args) {
        JFrame jf = new JFrame("Prototype pattern");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        Picture pic1 = new Picture("F:\\javaSE_workspace\\java中级\\out\\production\\java中级\\test\\001.png");

        MyClone myClone = new PictureClone();
        Picture pic2 = clonePicture(pic1,myClone);

        // 添加组件
        contentPane.add(pic1);
        contentPane.add(pic2);

        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}