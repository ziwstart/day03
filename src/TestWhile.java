/*
�ٳ�ʼ������
��ѭ������
�۵�������
��ѭ����
1.��ʽ��
��
while(��){
	��
	��
}
2.forѭ����while�����໥ת����
*/
class TestWhile{
	public static void main(String[] args) {
		//100���ڵ�ż�������,�����
		int i = 1;
		int sum = 0;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
			}
			i++;
	
		}
		System.out.println(sum);
		//System.out.println(i);
	}
}
