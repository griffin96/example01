package javatutorials;

public class MethodDemo6 {
   public static String numbering(int init, int limit)  {
	   int i = init;
	   
	   String output = "";
	   
	   while (i < limit) {
		   output += i;
		    i++;
	   }
	   return output;
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String result = numbering(2, 9); 
        System.out.println(result);
	}

}
