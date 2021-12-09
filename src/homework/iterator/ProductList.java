
package homework.iterator;
import java.util.*;

/**
 * @author kkddyz
 *
 * 商品数据类：具体聚合类
 */
public class ProductList extends AbstractObjectList {
	public ProductList(List<Object> products) {
		super(products);
	}

	//实现创建迭代器对象的具体工厂方法
	@Override
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}
} 
