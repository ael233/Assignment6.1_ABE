/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		int totalNodes = aSearch.getTotalNodesTraversed();
		int treeHeight = aSearch.calculateTreeHeight(root);
		System.out.println("Total number of nodes traversed: " + totalNodes);
		System.out.println("Total tree height is: " + treeHeight);
	}

}