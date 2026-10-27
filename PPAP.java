
public class PPAP  {

	public static void main(String[] args) {
		
		
		
		System.out.println(ppap("gabagbagbg"));
		
				
	}
	
	
	public static String ppap (String str) {
		
		 
		
	String a = str.substring(9, str.indexOf(","));
	String b = str.substring(9+a.length()+11);
	
	return "Uh!" + b + a;
	
		
		
	
		
	}

}
