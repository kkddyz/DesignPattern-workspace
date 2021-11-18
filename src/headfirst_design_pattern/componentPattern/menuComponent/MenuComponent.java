package headfirst_design_pattern.componentPattern.menuComponent;

/**
 * The type Menu component.
 *
 * @author kkddyz
 * <p>
 * 定义组件的相关操作,之所以使用抽象类而不是接口，是因为我们需要让子类决定实现哪些方法
 * Menu和MenuItem选择有意义的方法覆盖
 */
public abstract class MenuComponent {

    /**
     * 比如MenuItem是不能add,所以它就不覆盖这个方法。
     * <p>
     * 这样在使用的时候就会抛出UnsupportedOperationException.
     *
     * @param menuComponent the menu component
     */
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
