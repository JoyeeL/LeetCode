package easy;

import java.util.ArrayList;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
       int buy = Integer.MAX_VALUE;
       int sell = Integer.MIN_VALUE;
       boolean buyFlag = false;
       boolean sellFlag = false;
       int maxProfit = 0;
       int buyNum = 0;
       int sellNum = 0;
       for(int i = 0; i < prices.length; i ++){
    	   if(prices[i] <= prices[buyNum]) {   		   
    		   buyNum = i;
    		   buyFlag = true;
    		   continue;
    	   }  
    	   
    	   if(prices[i] >= sell && prices[i] > prices[buyNum]){    		 
    		   sellNum = i;
    		   sellFlag = true;
    	   }
    	   
    	  if(buyNum < sellNum){
    		  buy = prices[buyNum];
    		  sell = prices[sellNum];
    		  if(sell - buy > maxProfit){
    			  maxProfit  = sell - buy;
        		  buy = Integer.MAX_VALUE;
        	      sell = Integer.MIN_VALUE; 
    		  }
    		
    	  }
       }
       
      
       if(sellFlag == true && buyFlag == true) return maxProfit;
       else return 0;
    	   
    }
    
    public int maxProfit2(int[] prices) {
    	if(prices.length < 2) return 0;
    	int maxProfit = 0;
    	for(int i = 1 ; i < prices.length ; i ++){
    		int cha = prices[i] - prices[i-1];
    		if(cha > 0){
    			maxProfit += cha;
    		}
    	}
    	return maxProfit;
     	   
     }
    public static void main(String[] args) {
		int[] input ={1,2,4};
		BestTimetoBuyandSellStock bt = new BestTimetoBuyandSellStock();
		int max = bt.maxProfit2(input);
		System.out.println(max);
	}
}
