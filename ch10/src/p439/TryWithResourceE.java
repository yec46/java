package p439;

public class TryWithResourceE {
	public static void main(String[] args) {
		try(FileInputStrem fis =new FileInputStrem("file.txt")){
			fis.read();
			throw new Exception();
		}catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}

}
