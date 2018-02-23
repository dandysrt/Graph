
public interface GraphInterface 
{
	public void addEdge(int begin, int end);
	
	public boolean hasEdge(int begin, int end);
	
	public boolean isEmpty();
	
	public int getNumberOfVertices();
	
	public int getNumberOfEdges();
	
	public void clear();
}
