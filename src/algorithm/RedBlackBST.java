package algorithm;

public class RedBlackBST<Key extends Comparable<Key>,Value> {
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	
	private Node root;
	
	private class Node{
		Key key;
		Value value;	
		Node left,right;
		int N;
		boolean color;
		
		Node(Key key, Value value,int N,boolean color){
			this.key  = key;
			this.value = value;
			this.N = N;
			this.color = color;
		}
	}
	
	private boolean isRed(Node h){
		if(h == null) return false;
		return h.color;
	}
	
	public int size(){
		return size(root);
	}
	
	private int size(Node h){
		if(h == null) return 0;
		else return h.N;
	}
	private  Node rotateLeft(Node h){
		Node x = h.right ;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		x.N= h.N;
		h.N = 1 + size(h.left) + size(h.right);
		return x;
	}
	
	private Node rotateRight(Node h){
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		x.N = h.N;
		h.N = 1+ size(h.left) + size(h.right);
		return x;
	}
	
	private  void flipColors(Node h){
		 h.color = RED;
		 h.left.color = BLACK;
		 h.right.color = BLACK;
	 }
	
	 /**
     * return the value associated with the given key
     * @param key the key
     * @return the value associated with the given key if the key is in the symbol table, and null if it is not.
     */
	public Value get(Key key){
		return get(root,key);
	}
	
	private Value get(Node h,Key key){
		if(h == null) return null;
		int cmp = key.compareTo(h.key);
		if(cmp < 0) return get(h.left,key);
		if(cmp > 0) return get(h.right,key);
		else return h.value;
	}
	
	/*
	 * red - black tree insertion
	 */
	
	public void put(Key key,Value val){
		root = put(root,key,val);
		root.color = BLACK;
	}
	
	private Node put(Node h,Key key, Value val){
		if(h == null) return new Node(key,val,1,RED);
		int cmp = key.compareTo(h.key);
		if(cmp < 0) h.left = put(h.left,key,val);
		else if(cmp > 0) h.right = put(h.right,key,val);
		else h.value = val;
		
		if( isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
		if( isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
		if( isRed(h.right) && isRed(h.left)) flipColors(h);
		h.N = size(h.left) + size(h.right) + 1;
		return h;
	}
	 
	
	
}