
public class formatDemo {
	
	public static void main(String[] args) {
		String str = null;
		
		str = String.format("Hello, %s", "����");
		
		System.out.println(str);
		
		// �r������ %c
		System.out.printf("�r��: %c%n" , 'A');
		// �������� %b
		System.out.printf("5<2,���G: %b%n" , 5<2);
		// �������(�Q�i��) %d
		System.out.printf("500���@�b�O: %d%n", 500/2);
		// �������(�Q���i��) %x
		System.out.printf("500��16�i��O: %x%n", 500);
		// �������(�K�i��) %o
		System.out.printf("500��8�i��O: %o%n", 500);
		// �B�I������ %f �L�]�w�p���I
		System.out.printf("3000����9.1��O: %f%n", 3000*0.91);
		// �B�I������ %f �]�w�p���I,0�N�O���0���
		System.out.printf("3000����9.1��O: %.0f%n", 3000*0.91);
		// �B�I������(�Q���i��) %a
		System.out.printf("3000����16�i��O: %a%n", 3000*0.091);
		// �������� %e
		System.out.printf("3000�������ƬO: %e%n", 3000*0.091);
		// �q�ίB�I�� %g
		System.out.printf("3000�������ƩM�B�I�Ƶ��G�����׸��u���O: %g%n", 3000*0.91);
		// ���C�X %h
		System.out.printf("�r��A�����C�X�O: %h%n", 'A');
		// �ʤ������� %
		System.out.printf("3000�����馩�O: %d%%%n", 85);
	}

}