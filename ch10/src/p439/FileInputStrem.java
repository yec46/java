package p439;

public class FileInputStrem implements AutoCloseable{
	private String file;
	
	public FileInputStrem(String file) {
		this.file=file;
	}
	
	public void read() {
		System.out.println(file+"�� �н��ϴ�.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file+"�� �ݽ��ϴ�.");
		
	}

}
