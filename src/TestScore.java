/*
��д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�����score��ֵ������Ӧ�ĳɼ��ȼ���

score>=90           �ȼ���A
70<=score<90     �ȼ�: B
60=<score<70     �ȼ�: C
score<60             �ȼ���D

*/
import java.util.Scanner;
class TestScore{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧ���ĳɼ���");
		int score = s.nextInt();
		char level;
		/*
		if(score >= 90){
			level = 'A';
		}else if(score >= 70){
			level = 'B';
		}else if(score >= 60){
			level = 'C';
		}else{
			level = 'D';
		}
		*/
		switch(score / 10){
			case 10:
			case 9:
				level = 'A';
				break;
			case 8:
			case 7:
				level = 'B';
				break;
			case 6:
				level = 'C';
				break;
			default:
				level = 'D';
				break;
		}

		System.out.println("score:" + score + ",level:" + level);
	}
}
