package headfirst_design_pattern.IteratorPattern;


import java.util.Iterator;

/**
 * @author kkddyz
 * @date 2021/11/17
 * @description 餐厅菜单
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Diner1", "this is Diner1", true, 4.00);
        addItem("Diner2", "this is Diner2", false, 5.00);
        addItem("Diner3", "this is Diner3", true, 6.00);

        // 继续加入其他项目
    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[numberOfItems++] = menuItem;
    }

    /**
     * 我们根本不希望提供这样的方法，因为它会暴露内部实现细节
     */
    @Deprecated
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    /**
     * 返回迭代器接口
     */
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(this.menuItems);
    }

    // 其他依赖ArrayList的方法...
}
