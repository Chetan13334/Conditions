package allconditions;

public class NastedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=10;
		if(value>15)
		{
			if(value>5)
			{
				if(value>3)
					System.out.println("Value is right");
			}
			else {
				System.out.println("Wrong value please check");
			}
	   
		}
		
		else
		{
			System.out.println("Please check if conditions");
		}
	}
 }
