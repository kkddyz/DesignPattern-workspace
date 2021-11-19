package homework.proportyoe;


/**
 * @author kkddyz
 */
public class PictureClone implements MyClone {


    @Override
    public Object clone(Object oldObj) {
        Picture oldPic = (Picture)oldObj;
        // 1. 创建新对象
        Picture newPicture = new Picture();

        // 2. 拷贝状态
        String status = oldPic.getPath();
        newPicture.setPath(status);

        // 3. 返回深拷贝对象
        return newPicture;
    }
}
