package java_20190715;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte ������ �Ѿư��� ������ �����߻�
		//byte a1 = 128;
		int a1 = 128; //10����ǥ���
		int a2 = 076; //8����ǥ���
		int a3 = 0x123; //16����ǥ���
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		//long ���ͷ��� ���ڵڿ� 1, L�� ǥ���� 
		long a4 = 2200000000l; 
		System.out.println(a4);
		//float ���ͷ��� �Ҽ��� �ڿ� f,F�� ǥ����
		float f1 = 1223.43f;
		//double ���ͷ��� �Ҽ��� �ڿ� d,D�� ǥ��, ��������
		double d1 = 123455.56;
		System.out.println(d1);
		//boolean ���ͷ��� true, false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0d;
		//primitive data type�� == �����ڴ� ���� ����.
		System.out.println(a1==d1);
		
		int b1 = 10;
		int b2 = b1; //primitive data�� ��������� ����.
		b2 = 20;
		b2 = 30;
		System.out.println(b1);
		System.out.println(b2);
		char c1=c131;
		System.out.println(c1);
			
	}

}
