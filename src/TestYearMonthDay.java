//�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
import java.util.Scanner;
class TestYearMonthDay{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = s.nextInt();
		System.out.println("�������·ݣ�");
		int month = s.nextInt();
		System.out.println("���������ڣ�");
		int day = s.nextInt();

		int sum = 0;//������¼year��month��day����year��ڼ���
		//ʹ��switch-case
		switch(month){
		
		case 12:
			sum += 30;//30:ʮһ�·ݵ�������
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				sum += 29;
			}else{
				sum += 28;
			}
		case 2:
			sum += 31;//31:��һ�·ݵ�����
		case 1:
			sum += day;
	
		}
		System.out.println(sum);
	}
}