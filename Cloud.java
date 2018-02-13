import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cloud {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Enter a: ");
			double a = Double.parseDouble(in.readLine());
			System.out.println("Enter n: ");
			double n = Double.parseDouble(in.readLine());
			System.out.println("a^n = " + Math.pow(a, n));
			in.close();
		} catch(Exception e){};
	}

}
