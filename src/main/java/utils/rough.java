package utils;


public class rough {

	public static void main(String[] args) {
		
		String s = "xyz abc qwe";
		String[] words=s.split("\\s");
		for(String w:words){  
			System.out.println(w);  
			}  
		
		if (words[2].equals("qwe")) {
			System.out.println("this is correct");
		}
			else {
				System.out.println("not correct");
				
			}
		}

		
		
	
	
	
	}


