package headfirst_design_pattern.IteratorPattern;

import java.util.ArrayList;

/**
 * @author kkddyz
 * @date 2021/11/17
 * @description 煎饼屋菜单
 */
public class PancakeHouseMenu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("Pancake1","this is pancake1",true,1.99);
        addItem("Pancake2","this is pancake2",true,2.99);
        addItem("Pancake3","this is pancake3",false,3.99);

        // 继续加入其他项目
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    // 其他依赖ArrayList的方法...
}
