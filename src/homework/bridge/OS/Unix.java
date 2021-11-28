//designpatterns.bridge.UnixImp.java
package homework.bridge.OS;

import homework.bridge.Image.Matrix;

//Unix操作系统实现类，充当具体实现类
public class Unix implements OS {
    @Override
    public void doPaint(Matrix m) {
        //调用Unix系统的绘制函数绘制像素矩阵
        System.out.print("在Unix操作系统中显示图像：");
    }
}