/*
forѭ���ṹ��
1.��ʽ��
�ٳ�ʼ������
��ѭ������
�۵�������
��ѭ����
for(��;��;��){
	//��
}
2.ִ�й��̣���-��-��-��-��-��-��-������-��-��-��
   ��ֱ��ѭ�����������㣬�˳���ǰ��ѭ��
*/
class TestFor{
	public static void main(String[] args) {

		System.out.println("Hello World!" );
		System.out.println("Hello World!" );
		System.out.println("Hello World!" );
		System.out.println("Hello World!" );
		
		System.out.println();

		for(int i = 0;i < 4;i++){
			System.out.println("Hello World!" );
		}
		//System.out.println(i);
		int j = 1;
		for(System.out.print('a');j < 3;System.out.print('b'),j++){
			System.out.print('c');
		}
		//acbcb
		System.out.println();
		//��Ŀ�����100���ڵ�����ż��������ż���ĺͣ��ۼӵ�˼�룩��ż���ĸ���
		int sum = 0;//������¼����ż���ĺ�
		int count = 0;
		for(int i = 1;i <= 100;i++){//100���ڵ���Ȼ���ı���
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("�ܺ�Ϊ��" + sum);
		System.out.println("100����ż���ĸ���Ϊ��" + count);
	}
}
