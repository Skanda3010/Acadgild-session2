import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		
		System.out.println("Enter the age: ");
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		if(Age >= 18)
			System.out.println("You are eligible to Vote !!");
		else
			System.out.println("You are not eligible to Vote! ");
	}

}
