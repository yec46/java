package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/* 
 * ��¥: 2019.10.31	
 * �̸�:�ڼ�
 * ����: �����ͺ��̽� ���α׷���
 */
public class DatebaseTest {
	public static void main(String[] args) throws Exception{
		
		//DB����
		String host="jdbc:mysql://192.168.44.9:3306/pse";
		String user="pse";
		String pass="1234";
		
		//1�ܰ�-JDBC ����̹��ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ�-�����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn !=null) {
			System.out.println("�����ͺ��̽� ���� ����!");
		}
		
		//3�ܰ�-SQL���ఴü ����
		//4�ܰ�-SQL ����
		//5�ܰ�-SELECT ����� ó��
		//6�ܰ�-�����ͺ��̽� ����
		conn.close();
		
	}

}
