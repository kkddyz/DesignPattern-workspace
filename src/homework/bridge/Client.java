
package homework.bridge;

import homework.bridge.Image.Image;
import homework.bridge.OS.OS;

//客户端测试类
public class Client {
	public static void main(String args[]) {
		Image image;
		OS imp;
		image = (Image)XMLUtil.getBean("image");
		imp = (OS)XMLUtil.getBean("os");
		image.setImageImp(imp);
		image.parseFile("test.gif");
	}
}