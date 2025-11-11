
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String cheer = args[0];
                int n = Integer.parseInt(args[1]);
                String anletter = "AEFHILMNORSX";
                for (int i = 0; i < cheer.length(); i++) {
                 char ch = cheer.charAt(i);
                 if (anletter.indexOf(ch) != -1 ) {
                  System.out.println("Give me an " + ch + ": " + ch + "!");
                        } else { 
                                System.out.println("Give me a  " + ch + ": " + ch + "!");
                        }
                }        
                
 System.out.println("What does that spell?");
                                
 for (int h = 0; h < n; h++){

 System.out.println(cheer + "!!!");
                        
                
        }
        
     } 
 }

