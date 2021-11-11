package homework.abstractFactory;


import homework.abstractFactory.componentsFactory.impl.SummerStyleComponentsFactory;
import homework.abstractFactory.skin.Skin;
import homework.abstractFactory.skin.SpringSkin;
import homework.abstractFactory.skin.SummerSkin;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description 简单工厂 + 抽象工厂
 */
public class SkinFactory {

    Skin createSkin(String style) {
        Skin skin;
        if ("spring".equals(style)) {
            skin = new SpringSkin(new SummerStyleComponentsFactory());
        } else if ("summer".equals(style)) {
            skin = new SummerSkin(new SummerStyleComponentsFactory());
        } else {
            skin = null;
        }
        return skin;
    }
}