package middling.solution012;

public class Solution {
	  public String intToRoman(int num) {
	        StringBuilder sb=new StringBuilder();
	        while(num>0){
	            if(num/1000>0){
	                num=num-1000;
	                sb.append("M");
	                continue;
	            }
	            if(num/900>0){
	                num=num-900;
	                sb.append("CM");
	                continue;
	            }
	            if(num/500>0){
	                num=num-500;
	                sb.append("D");
	                continue;
	            }
	            if(num/400>0){
	                num=num-400;
	                sb.append("CD");
	                continue;
	            }
	            if(num/100>0){
	                num=num-100;
	                sb.append("C");
	                continue;
	            }
	            if(num/90>0){
	                num=num-90;
	                sb.append("XC");
	                continue;
	            }
	            if(num/50>0){
	                num=num-50;
	                sb.append("L");
	                continue;
	            }
	            if(num/40>0){
	                num=num-40;
	                sb.append("XL");
	                continue;
	            }
	            if(num/10>0){
	                num=num-10;
	                sb.append("X");
	                continue;
	            }   
	              if(num/9>0){
	                num=num-9;
	                sb.append("IX");
	                continue;
	            }   
	              if(num/5>0){
	                num=num-5;
	                sb.append("V");
	                continue;
	            }   
	              if(num/4>0){
	                num=num-4;
	                sb.append("IV");
	                continue;
	            }   
	               if(num/1>0){
	                num=num-1;
	                sb.append("I");
	                continue;
	            }   
	        }
	        return sb.toString();
	    }

	public static void main(String[] args) {

		String intToRoman = new Solution().intToRoman(1300);
		System.out.println(intToRoman);
	}
}
