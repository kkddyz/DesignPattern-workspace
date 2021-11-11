package homework.abstractFactory.skin;

import homework.abstractFactory.componentsFactory.ComponentsFactory;
import homework.abstractFactory.skin.Skin;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description
 */
public class SummerSkin extends Skin {
    /**
     * 子类通过原料工厂拿到原料后可能会需要一些处理，但是这里不需要所以就没写
     */
    public SummerSkin(ComponentsFactory componentsFactory) {
        super(componentsFactory);
        skinName = "summer";
    }
}
