package headfirst_design_pattern.IteratorPattern.Iterator;

import headfirst_design_pattern.IteratorPattern.MenuItem;

/**
 * @author kkddyz
 * @date 2021/11/17
 * @description 午餐菜单项
 */
public class DinerMenuIterator implements Iterator {
    // 依赖具体实现
    MenuItem[] items;

    // pos指向next
    int next = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        // position == menuItems.length 说明是最后一个没有next了
        // 保证返回的不是null: 没有填入元素的值是null(默认初始值);
        return (next < items.length) && (items[next] != null);
    }

    @Override
    public Object next() {
        return items[next++];
    }
}
