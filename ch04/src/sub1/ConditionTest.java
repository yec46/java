package sub1;

/*
 * ��¥ : 2019.10.11
 * �̸� : �ڼ�
 * ���� : ���ǹ� (P.108)
*/

public class ConditionTest 
{
	public static void main(String[] args) 
	{
		//if
		int num1=1, num2=2;
		if(num1>num2)
		{
			System.out.println("num1�� num2���� ũ��.");
		}
		
		//��ø if
		if(num1>0) // if(num1>0&&num2>1) 
		{
			if(num2>1)
			{
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
			}
		}
				
		//if~else
		if(num1>num2)
		{
			System.out.println("num1�� num2���� ũ��."); //�� ����
		}
		else
		{
			System.out.println("num1�� num2���� �۴�."); //���� ����
		}
		
		//if~else if~else
		int n1=1, n2=2, n3=3, n4=4;
		if(n1>n2) 
		{
			System.out.println("n1�� n2���� ũ��.");
		} 
		else if (n2>n3) 
		{
			System.out.println("n2�� n3���� ũ��.");
		} 
		else if (n3>n4) 
		{
			System.out.println("n3�� n4���� ũ��.");
		}
		else 
		{
			System.out.println("n4�� ����ũ��.");
		}
		
		//switch
		String fruit="apple";
		switch(fruit)
		{
		case "banana":
			System.out.println("�ٳ��� �Դϴ�.");
			break;
		case "orange":
			System.out.println("������ �Դϴ�.");
			break;
		case "apple":
			System.out.println("��� �Դϴ�.");
			break;
		case "grape":
			System.out.println("���� �Դϴ�.");
			break;
		default:
			System.out.println("�� �� �����ϴ�.");
			break;	
		}
		System.out.println("���α׷� ����...");
	}
}
