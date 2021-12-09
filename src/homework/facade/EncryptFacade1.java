
package homework.facade;

//加密外观类：外观类
public class EncryptFacade1 extends AbstractEncryptFacade {
    //维持对其他对象的引用
    private FileReader reader;
    private CipherMachine1 cipher;
    private FileWriter writer;

    public EncryptFacade1() {
        reader = new FileReader();
        cipher = new CipherMachine1();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        // 读取明文
        String plainStr = reader.read(fileNameSrc);
        // 加密
        String encryptStr = cipher.encrypt(plainStr);
        // 写入密文
        writer.write(encryptStr, fileNameDes);
    }
}