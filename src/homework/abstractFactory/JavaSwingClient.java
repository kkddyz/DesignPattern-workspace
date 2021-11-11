package homework.abstractFactory;

import homework.abstractFactory.skin.Skin;

import java.util.Scanner;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 作为客户，根据参数获取不同风格的皮肤(产品) -- 从SkinFactory获取
 */
public class JavaSwingClient {


    public static void main(String[] args) {
        SkinFactory skinFactory = new SkinFactory();
        System.out.println("你好,请输入你想使用的皮肤库");
        Scanner in = new Scanner(System.in);
        String style;
        while (!"exit".equals( style = in.next() ) ) {
            Skin skin = skinFactory.createSkin(style);

            if (skin == null) {
                System.out.println("抱歉没有该皮肤");
            } else {
                skin.display();
            }
        }
        System.out.println("再见！");
    }
}
