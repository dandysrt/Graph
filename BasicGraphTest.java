import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BasicGraphTest 
{
	BasicGraph myGraph;
	@Before
	public void setUp() throws Exception 
	{
		myGraph = new BasicGraph();
	}

	@After
	public void tearDown() throws Exception 
	{
		myGraph = null;
	}

	@Test
	public void when_graph_is_created_isEmpty_should_return_true() 
	{
		assertTrue(myGraph.isEmpty());
	}
	
	@Test
	public void when_graph_has_edge_isEmpty_should_return_false()
	{
		myGraph.addEdge(5, 2);
	}
	
	@Test
	public void get_number_of_Edges_should_return_correct_amount()
	{
		myGraph.addEdge(1,2);
		myGraph.addEdge(5,6);
		myGraph.addEdge(2,3);
		myGraph.addEdge(4,7);
		
		assertEquals(myGraph.getNumberOfEdges(), 4);
	}
	
	@Test
	public void when_clear_is_called_isEmpty_should_return_true()
	{
		myGraph.addEdge(1, 2);
		myGraph.addEdge(1, 1);
		myGraph.addEdge(0,1);
		myGraph.addEdge(4, 7);
		myGraph.clear();
		
		assertTrue(myGraph.isEmpty());
	}
	
	@Test
	public void when_getNumberOfVertices_is_called_with_default_constructor_should_return_10()
	{
		assertEquals(10,myGraph.getNumberOfVertices());
	}
	
	@Test
	public void when_addVertex_is_called_getNumberOfVertices_should_return_increased_number()
	{
		myGraph.addVertices(1);
		assertEquals(11,myGraph.getNumberOfVertices());
	}
	
	@Test
	public void when_addVertex_is_called_on_a_populated_graph_isEmpty_should_return_false()
	{
		myGraph.addEdge(1,2);
		myGraph.addEdge(5,6);
		myGraph.addEdge(2,3);
		myGraph.addEdge(4,7);
		myGraph.addVertices(1);
		myGraph.addEdge(10, 9);
		assertFalse(myGraph.isEmpty());
	}
	
	@Test 
	public void getNeighbors()
	{
		myGraph.addEdge(1,2);
		myGraph.addEdge(1,1);
		myGraph.addEdge(2,1);
		myGraph.addEdge(2,3);
		myGraph.getNeighbors(1, 1);
	}
}
