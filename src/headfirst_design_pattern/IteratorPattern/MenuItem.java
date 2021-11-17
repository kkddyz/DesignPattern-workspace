package headfirst_design_pattern.IteratorPattern;

/**
 * @author kkddyz
 * @date 2021/11/17
 * @description 菜单项
 */
public class MenuItem {
    String name;

    String description;

    /**
     * 是否是素菜
     */
    boolean vegetarian;

    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }
}
