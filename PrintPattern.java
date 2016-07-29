
public class PrintPattern {

	public static void main(String[] args) {
		
		System.out.println("Priting For loop pattern:");
		
		ForLoopPattern();
		
		System.out.println("Printing While loop pattern:");
		
		WhileLoopPattern();

	}
	
	public static void ForLoopPattern (){
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
			
		}
	}
	
	public static void WhileLoopPattern (){
		int i=1,j;
		do
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
			i++;
		}while(i<=5);
		i-=2;
		while(i>=1)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		    i--;
		}
	}

}
