package homework.facade;

public class EncryptFacade2 extends AbstractEncryptFacade {
	private FileReader reader;
	private CipherMachine2 cipher;
	private FileWriter writer;
	
	public EncryptFacade2() {
		reader = new FileReader();
		cipher = new CipherMachine2();
		writer = new FileWriter();
	}
	
	@Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr,fileNameDes);
	}
}