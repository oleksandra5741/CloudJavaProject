import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cloud {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Enter k: ");
			double k = Double.parseDouble(in.readLine());
			System.out.println("Enter b: ");
			double b = Double.parseDouble(in.readLine());
			System.out.println("k^b = " + Math.pow(k, b));
			in.close();
		} catch(Exception e){};
	}

}
