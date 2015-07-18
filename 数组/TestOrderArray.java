public class TestOrderArray{
	private long[] arr;
	private int arrIndex; 
	
	public TestOrderArray(){
		arr = new long[50];
	}
	
	public TestOrderArray(int maxsize){
		arr = new long[maxsize];
	}
	
	/**
	 *�������
	 */
	 public void insert(long value){
		 int i;
		 for(i = 0; i < arrIndex; i++){
			 if(arr[i] > value) break;
		 }
		 for(int j = arrIndex-1; j >= i; j--){
			 arr[j+1] = arr[j];
		 }
		 arr[i] = value;
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
	 *���ֲ���
	 */
	 public int binarySearch(long value){
		 int middle = 0;
		 int low = 0;
		 int high = arrIndex;
		 while(true){
			 if(low >= high) return -1;
			 middle = (low + high)/2;
			 if(value == arr[middle]) return middle;
			 else if(value < arr[middle]) high = middle - 1;
			 else if(value > arr[middle]) low = middle + 1; 
		 }
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