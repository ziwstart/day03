/*
һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"�������ӣ���ȥ�������������Լ����
����6=1��2��3.��� �ҳ�1000���ڵ���������
*/
class TestWanShu{
	public static void main(String[] args){
		int factor = 0;
		for(int i = 1;i <= 1000;i++){
			//ÿִ����һ�����µ�ѭ�����ͻὫi�����е������ۼӵ�factor��
			for(int j = 1;j < i;j++){
				if(i % j == 0){
					factor += j;
				}
			}
			if(i == factor){
				System.out.println(i);
			}
			factor = 0;
		}
	}
}
