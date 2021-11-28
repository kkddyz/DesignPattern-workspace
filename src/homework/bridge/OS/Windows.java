//designpatterns.bridge.WindowsImp.java
package homework.bridge.OS;


import homework.bridge.Image.Matrix;

//Windows操作系统实现类，充当具体实现类
public class Windows implements OS {
    @Override
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Windows操作系统中显示图像：");
    }
}