/*

100���ڵ���������

*/
class TestPrimeNumber{
	public static void main(String[] args){
		boolean flag = false;
		long start = System.currentTimeMillis();//��ȡϵͳ��ǰ�ĺ�����
		for(int i = 2;i <= 100000;i++){//ʵ��100���ڵ���Ȼ���ı���
			//����ж�i�Ƿ�Ϊһ������
			for(int j = 2;j <= Math.sqrt(i);j++){
				if(i % j == 0){
					flag = true;
					break;
				}
			}
			if(!flag){//if(flag == false){
				//System.out.println(i);
			}
			flag = false;
		}
		long end = System.currentTimeMillis();
		System.out.println("�����ѵ�ʱ��Ϊ��" + (end - start));
		//35535--����break��10059--ʹ��Math.sqrt():
	}
}
