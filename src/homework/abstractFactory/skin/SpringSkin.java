package homework.abstractFactory.skin;

import homework.abstractFactory.componentsFactory.ComponentsFactory;
import homework.abstractFactory.componentsFactory.impl.SpringStyleComponentsFactory;
import homework.abstractFactory.skin.Skin;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description
 */
public class SpringSkin extends Skin {

    public SpringSkin(ComponentsFactory componentsFactory) {
        super(componentsFactory);
        skinName = "spring";
    }
}
