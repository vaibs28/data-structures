package BST;

public class BST {

	static Node root = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		root=insert(root, 10);
		insert(root, 5);
		insert(root, 1);
		insert(root,7);
		insert(root,40);
		insert(root,50);
		
		//inorder(root);
		preorder(root);
		System.out.println("height"+height(root));
	}
	
	public static int height(Node root) {
		
		if(root==null) {
			return 0;
		}
		int lheight= height(root.left);
		int rheight= height(root.right);
		
		if(lheight>rheight)
			return(lheight+1);
		else
			return(rheight+1);
	}
	
	public static Node insert(Node root,int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		
		if(data<root.data) {
			root.left = insert(root.left,data);
		}
		
		else if(data>root.data) {
			root.right = insert(root.right, data);
		}
		
		return root;
	}

	public static void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public static void preorder(Node root) {
		if(root==null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
}

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(){
		left = null;
		right= null;
	}
	
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

