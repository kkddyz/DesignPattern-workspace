package headfirst_design_pattern.IteratorPattern;

import headfirst_design_pattern.IteratorPattern.Iterator.Iterator;

import java.util.ArrayList;

/**
 * @author kkddyz
 * @date 2021/11/17
 * @description 女服务生
 */
public class Waitress {

    /**
     * 打印午餐菜单
     */
    public void printLunchMenu() {
        DinerMenu dinerMenu = new DinerMenu();

        // 午餐菜单
        Iterator iterator = dinerMenu.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        new Waitress().printLunchMenu();
    }
}
