package homework.bridge.Image;

import homework.bridge.OS.OS;

//抽象图像类，充当抽象类
public abstract class Image {
	public OS imp;

	//注入实现类接口对象
	public void setImageImp(OS imp) {
		this.imp = imp;
	}

	public abstract void parseFile(String fileName);
}