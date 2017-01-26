package medium;

import java.util.ArrayList;
import java.util.List;
/*
 * 对于某个合法的字符串，我们可以发现从合法字符串的任何一个位置看，“（”的数目 >= ")"的数目，即剩余的“（”的数目 <= 剩余的"）"数目,
 */
public class GenerateParentheses_22 {
	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if(n <= 0) return result;
        generate(result,"",n,n);
        return result;
    }
   private void generate(List<String> result,String current,int leftNum,int rightNum){
	   if(leftNum == 0 && rightNum == 0) {
		   result.add(current);
		   return ;
	   }
	   if(leftNum > 0){
		   generate(result,current+"(",leftNum-1,rightNum);
	   }
	   if(leftNum < rightNum && rightNum > 0){
		   generate(result,current+")",leftNum,rightNum-1);
	   }
   }
   
   public static void main(String[] args) {
	  int n = 3;
	  GenerateParentheses_22 gp = new GenerateParentheses_22();
	  List<String> result = gp.generateParenthesis(n);
	  for(int i = 0; i < result.size(); i ++){
		  System.out.println(result.get(i));
	  }
}

}
