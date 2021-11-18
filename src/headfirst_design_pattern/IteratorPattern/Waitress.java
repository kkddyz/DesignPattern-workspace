package headfirst_design_pattern.IteratorPattern;


import java.util.Iterator;

/**
 * @author kkddyz
 * @date 2021/11/17
 * @description 女服务生
 */
public class Waitress {

    Menu breakfastMenu;
    Menu lunchMenu;

    public Waitress(Menu breakfastMenu, Menu lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    /**
     * 打印菜单
     */
    public void printMenu() {

        Iterator breakfastMenuIterator = breakfastMenu.createIterator();
        Iterator lunchMenuIterator = lunchMenu.createIterator();

        System.out.println("打印breakfastMenu");
        printMenu(breakfastMenuIterator);

        System.out.println("打印lunchMenu");
        printMenu(lunchMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        new Waitress(new PancakeHouseMenu(),new DinerMenu()).printMenu();
    }
}
