public class TestArray{
	private long[] arr;
	private int arrIndex; 
	
	public TestArray(){
		arr = new long[50];
	}
	
	public TestArray(int maxsize){
		arr = new long[maxsize];
	}
	
	/**
	 *�������
	 */
	 public void insert(long value){
		 arr[arrIndex] = value;
		 arrIndex++;
	 }
	 /**
	 *��ʾ����
	 */
	 public void display(){
		 for(int i=0; i<arrIndex; i++){
			 System.out.print(arr[i] + " ");
		 }
		 System.out.println();
	 }
	 /**
	 *����ֵ��������,��������
	 */
	 public int search(long value){
		 int i;
		 for(i = 0; i < arrIndex; i++){
			 if(value == arr[i]) break;
		 } 
		 
		 if(i == arrIndex) return -1;
		 else return i;
	 } 
	 /**
	 *����������������,���ز鵽��ֵ
	 */
	 public long get(int index){
		 if(index >= arrIndex) throw new ArrayIndexOutOfBoundsException();
		 else return arr[index];
	 }
	 /**
	 *ɾ������
	 */
	 public void delete(int index){
		 for(int i = index; i < arrIndex; i++){
			 arr[i] = arr[i+1];
		 }
	 }
	 /**
	 *��������
	 */
	 public void change(int index, long value){
		 if(index >= arrIndex || index < 0) throw new ArrayIndexOutOfBoundsException();
		 else arr[index] = value;
	 }
}