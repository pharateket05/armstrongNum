package Practice;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		
		int n = 371, rem, result = 0, Num;
		Num = n;
		
		while (Num != 0) {
			
			rem = Num % 10;
			result += Math.pow(rem, 3);
			Num /= 10;
			
		}
		
		if(result == n)
			System.out.println(n + " is a Armstrong ");
		else
			System.out.println(n + " is not Armstrong ");
	}

}
