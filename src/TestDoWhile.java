/*
�ٳ�ʼ������
��ѭ������
�۵�������
��ѭ����

1.��ʽ��
��
do{
	��
	��
}while(��);

2.do-while��while������:do-whileѭ�����ٻ�ִ��һ�Σ�
*/

class TestDoWhile{
	public static void main(String[] args) {
		int i = 1;
		do{
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}while(i <= 100);
		
		
		//do-while��while������
		int j = 10;
		do{
			System.out.println(j);
			j++;
		}while(j < 10);


		while(j < 10){
			System.out.println(j);
			j++;
		}
	}
}
