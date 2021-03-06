package algorithm;

public class RedBlackBST<Key extends Comparable<Key>,Value> {
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	
	private RedBlackNode root;
	
	private class RedBlackNode{
		Key key;
		Value value;	
		RedBlackNode left,right;
		int N;
		boolean color;
		
		RedBlackNode(Key key, Value value,int N,boolean color){
			this.key  = key;
			this.value = value;
			this.N = N;
			this.color = color;
		}
	}
	
	private boolean isRed(RedBlackNode h){
		if(h == null) return false;
		return h.color;
	}
	
	public int size(){
		return size(root);
	}
	
	private int size(RedBlackNode h){
		if(h == null) return 0;
		else return h.N;
	}
	
	//左旋转
	private  RedBlackNode rotateLeft(RedBlackNode h){
		RedBlackNode x = h.right ;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		x.N= h.N;
		h.N = 1 + size(h.left) + size(h.right);
		return x;
	}
	
	//右旋转
	private RedBlackNode rotateRight(RedBlackNode h){
		RedBlackNode x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		x.N = h.N;
		h.N = 1+ size(h.left) + size(h.right);
		return x;
	}
	
	private  void flipColors(RedBlackNode h){
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
	
	private Value get(RedBlackNode h,Key key){
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
	
	private RedBlackNode put(RedBlackNode h,Key key, Value val){
		if(h == null) return new RedBlackNode(key,val,1,RED);
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
