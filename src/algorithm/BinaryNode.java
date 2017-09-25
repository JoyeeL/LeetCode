package algorithm;

public class BinaryNode {
	private char key;
	private BinaryNode left, right;
	
	public BinaryNode(char key) {
	   this(key, null, null);
	}
	
	public BinaryNode(char key, BinaryNode left, BinaryNode right) {
	   this.key = key;
	   this.left = left;
	   this.right = right;
	}
	
	public char getKey() {
	   return key;
	}
	
	public void setKey(char key) {
	   this.key = key;
	}
	
	public BinaryNode getLeft() {
	   return left;
	}
	
	public void setLeft(BinaryNode left) {
	   this.left = left;
	}
	
	public BinaryNode getRight() {
	   return right;
}

public void setRight(BinaryNode right) {
   this.right = right;
}
}

