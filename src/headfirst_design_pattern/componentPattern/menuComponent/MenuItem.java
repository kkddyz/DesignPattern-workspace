package headfirst_design_pattern.componentPattern.menuComponent;

/**
 * @author kkddyz
 * @date 2021/11/18
 * @description 菜单项
 */
public class MenuItem extends MenuComponent {
    String name;

    String description;

    boolean isVegetarian;

    double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        String printStr =
                "MenuItem{" +
                        "name='" + name + '\'' +
                        ", description='" + description + '\'' +
                        ", isVegetarian=" + isVegetarian +
                        ", price=" + price +
                        '}';

        System.out.println(printStr);
    }
}
