package java_20190715;

public class CastingDemo {
	public static void main(String[] args) {
		//overflow �߻��Ͽ� ������ ����
		//byte b1 = 250;
		byte b1 = (byte)250;//circuit �߻�, ������������
		
		System.out.println(b1);
		
		int i1 = (int)123.45;//cut �߻�
		
		System.out.println(i1);
		
		double d1 = 123.45f;//�ڵ� ����ȯ
		
		byte b2 = 10;
		byte b3 = 20;
		byte b4 = (byte) (b2 + b3);
		//��������ڴ� ��ȯ���� int�̱� ������ ��ü�� byte�� 
		//����ȯ�ؾ� ������ �߻����� ����.
		System.out.println(b4);
		
	}

}
