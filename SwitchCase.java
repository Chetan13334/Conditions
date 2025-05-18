package allconditions;

public class SwitchCase {

	public static void main(String[] args) {
		int month=2;
		switch(month)
		{
		case 1 :
			System.out.println("jan");
			break;    // break keyword use to stop next output.
		case 2 :
			System.out.println("Feb");
			break;
		case  3:
			System.out.println("march");
			break;
		case 4 :
			System.out.println("april");
			break;
		case 5 :
			System.out.println("june");
			break;
			
			default:
				System.out.println("Wrong Input");
			
		}
		System.out.println("Im Out Of All Case");

	}

}
