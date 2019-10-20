package Tree;

public class BinaryTree {
	
	Node root= null;
	
	BinaryTree(int key){
		root = new Node(key);
	}
	
    BinaryTree(){
		root = null;
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		
		
	}

}
