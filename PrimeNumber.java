
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num,i,count;
		System.out.println("The prime numbers between 1 and 100 are :");
		for(num=1;num<=100;num++)
		{
			count =0;
			for(i=1;i<=num;i++)
			{
				if(num%i == 0)
					count++;
			}
		if(count == 2)
			System.out.print(num +",");
		}
	}

}
