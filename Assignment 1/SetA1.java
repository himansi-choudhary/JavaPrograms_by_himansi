package assignment_1;
import java.io.*;

public class SetA1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number: ");
		
		int num = Integer.parseInt(br.readLine());

        System.out.println("Multiplication table of " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
	}

}
















//2. Use a try-catch block to handle the exception inside main
//
//If you prefer not to add throws IOException, you can catch the exception instead:

//package assignment_1;
//import java.io.*;
//
//public class SetA1 {
//
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//        try {
//            System.out.println("Enter a number: ");
//            int num = Integer.parseInt(br.readLine());
//
//            System.out.println("Multiplication table of " + num + ":");
//
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(num + " x " + i + " = " + (num * i));
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading input: " + e.getMessage());
//        }
//    }
//}

