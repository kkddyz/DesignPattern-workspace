
package homework.facade;

public class Client {
    public static void main(String args[]) {
        AbstractEncryptFacade ef;
        ef = (AbstractEncryptFacade) XMLUtil.getBean();
        ef.fileEncrypt("src//homework//facade//src.txt", "src//homework//facade//des.txt");

    }
}
