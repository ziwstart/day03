/*
Ƕ��ѭ����ѭ���л���������ѭ�����൱���ڲ�ѭ��������䵱���ѭ����ѭ����
for(;;){
	for(;;){
		
	}
}

����
while(){
	for(;;){}
}
*/

class TestForFor{
	
	public static void main(String[] args) {
		/*
		*****
		*****
		*****
		*****
		*/
		for(int j = 0;j < 4;j++){//���ѭ����������
			for(int i = 0;i < 5;i++){//�ڲ�ѭ����������
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		*
		**
		***
		****
		*/
		for(int j = 0;j < 4;j++){//���ѭ����������
			for(int i = 0;i < j + 1;i++){//ÿ�����j + 1��
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		*****
		****
		***
		**
		*
		*/
		for(int i = 0; i < 5;i++){
			for(int j = 0;j < 5-i;j++){//for(int j = i;j < 5;j++)
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		*/
		for(int j = 0;j < 4;j++){//���ѭ����������
			for(int i = 0;i < j + 1;i++){//ÿ�����j + 1��
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5;i++){
			for(int j = 0;j < 5-i;j++){//for(int j = i;j < 5;j++)
				System.out.print("*");
			}
			System.out.println();
		}

/*
��ӡ����ͼ��
----*
---* *
--* * *
-* * * *
* * * * *
i	k-	j*   k = 4 - i   j = i + 1
0	4	1
1	3	2
2	2	3
3	1	4
4	0	5
-* * * *
--* * *
---* *
----*
i	k-	j*   k = i + 1   j = 4 - i 
0	1	4	
1	2	3
2	3	2
3	4	1
*/	
	//�ϰ벿�֣�
	for(int i = 0;i < 5;i++){
		for(int k = 0;k < 4 - i;k++){
			System.out.print(" ");
		}
		for(int j = 0;j < i + 1;j++){
			System.out.print("* ");
		}
		System.out.println();
    }
	//�°벿��
	for(int i = 0;i < 4;i++){
		for(int k = 0;k < i + 1;k++){
			System.out.print(" ");
		}
		for(int j = 0;j < 4 - i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
