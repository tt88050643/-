public class HanNuoTower{
	/*
	 *�ƶ�����
	 *topN:�ƶ���������
	 *from����ʼ����
	 *inter���м�����
	 *to��Ŀ������
	 */
	 static int count;
	 public static void doTower(int topN, char from, char inter, char to){
		 count++;
		 if(topN == 1){
			 System.out.println("����1����" + from + "������" + to + "����");	 
		 }else{
			 doTower(topN-1, from, to, inter);
			 System.out.println("����" + topN + "����" + from + "������" + to + "����");
			 doTower(topN-1, inter, from, to);
		 }
	 }
}
