package headfirst_design_pattern.componentPattern;

import headfirst_design_pattern.componentPattern.menuComponent.MenuComponent;

/**
 * @author kkddyz
 * @date 2021/11/18
 * @description 女服务生:菜单的客户
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
