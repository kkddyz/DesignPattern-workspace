package headfirst_design_pattern.componentPattern;

import headfirst_design_pattern.componentPattern.menuComponent.Menu;
import headfirst_design_pattern.componentPattern.menuComponent.MenuComponent;
import headfirst_design_pattern.componentPattern.menuComponent.MenuItem;

/**
 * @author kkddyz
 * @date 2021/11/18
 * @description
 */
public class MenuTestDrive {
    public static void main(String[] args) {

        // 各种菜单
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Diner");

        // 创建最顶层菜单
        MenuComponent allMenus = new Menu("ALL MENS","All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 加入菜单项
        pancakeHouseMenu.add(new MenuItem("pancake1","this is pancake1",true,1.99));
        pancakeHouseMenu.add(new MenuItem("pancake2","this is pancake2",false,2.99));
        pancakeHouseMenu.add(new MenuItem("pancake3","this is pancake3",true,3.99));

        dinerMenu.add(new MenuItem("diner1","this is diner1",true,4.55));
        dinerMenu.add(new MenuItem("diner2","this is diner2",false,5.55));
        dinerMenu.add(new MenuItem("diner3","this is diner3",true,6.55));

        cafeMenu.add(new MenuItem("cafe1","this is cafe1",true,2.77));
        cafeMenu.add(new MenuItem("cafe2","this is cafe2",false,3.77));
        cafeMenu.add(new MenuItem("cafe3","this is cafe3",true,4.77));

        // 测试waitress
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
