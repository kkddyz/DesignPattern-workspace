package homework.bridge.OS;

import homework.bridge.Image.Matrix;

//抽象操作系统实现类，充当实现类接口
public interface OS {
	public void doPaint(Matrix m);  //显示像素矩阵m
}
