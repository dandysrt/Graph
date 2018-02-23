import java.util.Arrays;


public class BasicGraph implements GraphInterface
{
	int capacity = 10;
	private int[][] adjacencyMatrix = new int[capacity][capacity];
	
	
	
	public BasicGraph(int capacity)
	{
		this.capacity = capacity;
	}
	
	public BasicGraph()
	{
		this(10);
	}
	
	@Override
	public void addEdge(int begin, int end) 
	{
		adjacencyMatrix[begin][end] = 1;
		adjacencyMatrix[end][begin] = 1;
		
	}
	
	public void addDirectedEdge(int begin, int end, int weight)
	{
		adjacencyMatrix[begin][end] = weight;
	}
	
	public void addWeightedEdge(int begin, int end, int weight)
	{
		adjacencyMatrix[begin][end] = weight;
		adjacencyMatrix[end][begin] = weight;
	}

	@Override
	public boolean hasEdge(int begin, int end) 
	{
		if(adjacencyMatrix[begin][end] > 0 )
			return true;
		return false;
	}

	
	@Override
	public boolean isEmpty() 
	{
		for(int i = 0; i < capacity; i++)
			for(int j = 0; j <	capacity; j++)
				if(adjacencyMatrix[i][j] > 0)
					return false;
		return true;
	}

	@Override
	public int getNumberOfVertices() 
	{	
		return capacity;
	}
	
	public void addVertices(int x)
	{
		capacity += x;
		int[][] tempArray = new int[capacity][capacity];
		for(int i = 0; i < capacity - x; i++)
			for(int j = 0; j < capacity -x; j++)
			{
				tempArray[i][j] = adjacencyMatrix[i][j];
			}
		
		adjacencyMatrix = tempArray;
	}
	
	public void getNeighbors(int begin, int end)
	{
		int neighborArray[] ={adjacencyMatrix[begin -1][end], adjacencyMatrix[begin + 1][end], adjacencyMatrix[begin][end-1], adjacencyMatrix[begin][end+1]};
	
		for(int i = 0; i < 4; i++)
		{
			System.out.print(neighborArray[i]);
		}
		
	}
	@Override
	public int getNumberOfEdges() 
	{
		int counter = 0;
		for(int i = 0; i < capacity; i++)
			for(int j = 0; j < capacity; j++)
				if(adjacencyMatrix[i][j] > 0)
					counter++;
		return counter / 2;
	}

	@Override
	public void clear() 
	{
		for(int i = 0; i < capacity; i++)
			for(int j = 0; j < capacity; j++)
				adjacencyMatrix[i][j] = 0;
	}
	
}
