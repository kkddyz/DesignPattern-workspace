package headfirst_design_pattern.componentPattern.menuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The type Menu.
 *
 * @author kkddyz
 * @date 2021 /11/18
 * @description 菜单
 */
public class Menu extends MenuComponent {
    /**
     * The Menu components.
     */
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    /**
     * The Name.
     */
    String name;
    String description;

    /**
     * Instantiates a new Menu.
     *
     * @param name        the name
     * @param description the description
     */
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 通过递归print所有菜单项
     */
    @Override
    public void print() {
        System.out.println("菜单" + name + ": " + description);
        System.out.println("-------------------------------\n");
        // 获取迭代器
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
        System.out.println("");
    }
}
