
public class FromatDemo {
	public static void main(String[] args) {

		String str1 = null;  
		String str2 = null;
		
		// �榡�Ʀr�Ŧ�  
		str1 = String.format("�榡�Ѽ�$���ϥΡG%1$d,%2$d,%3$s", 99,44,"abc");  
		str2 = String.format("str2: %1$s,%2$d", "This is a test" , 100);
		
		// ��X�r�Ŧ��ܶq  
		System.out.println(str1);
		
		System.out.println(str2);
		
		System.out.printf("��ܥ��t�ƪ��Ÿ��G%+d�P%d%n", 99,-99);  
		  
		System.out.printf("�L�]�w0: %01d%n", 7);
		
		System.out.printf("�]�w���0: %03d%n", 7);
		  
		System.out.printf("Tab�䪺�ĪG�O�G% 8d%n", 7);  
		  
		System.out.printf("��Ƥ��ժ��ĪG�O�G%,d%n", 9989997);  
		  
		System.out.printf("�@���Ѫ�����O�G%2.2f��%n", 49.8);
		
		System.out.printf("�]�w�@�Ӥp���I: %2.1f��%n", 49.8);
		
	}

}