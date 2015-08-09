public class Graph{
	//��������
	private Vertex[] vertexList;
	//�ڽӾ���
	private int[][] adjMat;
	//����������Ŀ
	private int maxSize;
	//��ǰ�������
	private int nVertex;
	
	public Graph(int maxSize){
		vertexList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for(int i=0; i<maxSize; i++){
			for(int j=0; j<maxSize; j++){
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
	}
		//��Ӷ���
	public void addVertex(char label){
		vertexList[nVertex++] = new Vertex(label);
	}
	//��ӱ�,�ٽӾ��������
	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	public int getadjUnvisitedVertex(int v){
		for(int i=0; i<nVertex; i++){
			if(adjMat[v][i] == 1 && vertexList.[i].wasVisited == false){
				return i;
			}
		}
		return -1;
	}
	
}