/**
 * A class that conducts a depth first search of a tree and provides information about the tree
 * @author aelias2
 *
 */
public class DepthFirstSearch {
	Node root;
	int totalNodesTraversed = 0;
	int treeHeight = 0;
	
	public DepthFirstSearch() {
		System.out.println("Call DFS with root node to do a Depth First Search.");
	}//end DepthFirstSearch
	
	/**
	 * Conducts the depth first search of the tree
	 * @param node, the root node.
	 */
	public void DFS(Node node) {
		if(node == null) {
			return; //base case
		} 
		
		/**
		 * Prints the value of the node as it is traversed.
		 */
		System.out.println(node.getData());
		
		/**
		 * increments the node counter
		 */
		totalNodesTraversed++;
		
		DFS(node.getlChild());
		DFS(node.getrChild());
	}//end DFS
	
	/**
	 * Returns the total number of nodes traversed in the tree.
	 * @return totalNodesTraversed, the total number of nodes traversed in the tree.
	 */
	public int getTotalNodesTraversed() {
		return totalNodesTraversed;
	}//end getTotalNodesTraversed
	
	/**
	 * Calculates the height of the tree
	 * @param node, the root node
	 * @return the maximum height of the tree
	 */
	public int calculateTreeHeight(Node node) {
		if (node == null) {
			return 0; // If null, no height
		}
		
		/**
		 * recursive calls to both sides of the child trees
		 */
		int lChildHeight = calculateTreeHeight(node.getlChild());
		int rChildHeight = calculateTreeHeight(node.getrChild());
		
		/**
		 * Returns 1 + the maximum height from the two child trees to determine total height.
		 */
		return Math.max(lChildHeight,  rChildHeight) + 1; 
	}//end calculateTreeHeight
	
}//end class
