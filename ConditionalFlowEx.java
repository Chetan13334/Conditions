package allconditions;

public class ConditionalFlowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=60;
		int c=50;
		
		if (a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater ");
		}

	}

}
