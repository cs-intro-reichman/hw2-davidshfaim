// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
        int n = Integer.parseInt(args[0]); 
        double sum = 0.0;                   

        
        for (int k = 0; k < n; k++) {
            double term = Math.pow(-1, k) / (2.0 * k + 1);  
            sum = sum + term;                               
        }

        double piApprox = 4 * sum;           

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApprox);
    }
}
			
		
	

