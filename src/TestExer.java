/*
����һ��
�Ӽ��̶������Ϊ10�������������ж϶���������͸����ĸ�����
�������
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������

����ѭ����
for(;;){}
����
while(true){
}
˵����һ������£�������ѭ���ڲ�Ҫ�г�����ֹ����䣬ʹ��breakʵ�֡���û�У��Ǿ�����ѭ����

*/
import java.util.Scanner;
class TestExer{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = 0;//��¼�����ĸ���
		int b = 0;//��¼�����ĸ���
		//for(;;){
		while(true){
			System.out.println("������һ��������");
			int num = s.nextInt();
			if(num > 0)
				a++;
			else if(num < 0)
				b++;
			else
				break;	
		}
		
		
		/*
		����һ��
		for(int i = 0;i < 10;i++){
			System.out.println("�������" + (i + 1) + "������");
			int num = s.nextInt();
			if(num > 0)
				a++;
			else if(num < 0)
				b++;
		}
		*/
		System.out.println("�����ĸ���Ϊ��" + a);
		System.out.println("�����ĸ���Ϊ��" + b);
	}
}
