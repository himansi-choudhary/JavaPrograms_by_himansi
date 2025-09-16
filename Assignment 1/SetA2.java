package assignment_1;

public class SetA2 {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Please enter command line argument");
			return;
		}
		
		int num = Integer.parseInt(args[0]);
		int reversed = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num/10;
		}
		
		System.out.println("Reversed number:" +reversed);

	}

}
