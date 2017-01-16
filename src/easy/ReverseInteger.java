package easy;

public class ReverseInteger {
	public static int reverse(int x) {
		 long sum =0; 
		 int max = 2147483647;  //int最大值  
	     int min =-2147483648;
	     String str = String.valueOf(x);
		char[] w = str.toCharArray();
		char temp;
		if(str.length()==1) return x;
		if(w[0]=='-'){
			for(int i = 0 ;i <= str.length()/2; i++){
				if(i==0)w[i]='-';
				else{
					temp = w[i];
					w[i]= w[str.length()-i];
					w[str.length()-i]=temp;
					}
				}
				
			}
			else{
				for(int i = 0 ;i < str.length()/2; i++){			
					temp = w[i];
					w[i]= w[str.length()-1-i];
					w[str.length()-i-1]=temp;			
			}
			}
			
			str =new   String(w);
			sum = Long.parseLong(str);	
			if(sum> max || sum < min) return 0;
			x= (int)sum;
	        return x;
    }
	
	public static int reverse1(int x){
		long sum =0; 
		int max = 2147483647;  //int最大值  
	    int min =-2147483648;
	    int temp =0;
	    while(x!=0){
	    	temp = x %10;
	    	sum = sum*10+sum;
	    	x = x/10;
	    }
	    if(sum> max || sum < min) return 0;
		x= (int)sum;
        return x;
	}
	
	public static void main(String[] args) {
		int x = 1;
		x= reverse(x);
		System.out.println(x);
	}
}
