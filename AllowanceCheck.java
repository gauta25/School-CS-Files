public class AllowanceCheck
{
	public static void main(String[] args)
	{
	  // Gina's information setup & Variable creation
		float ALLOWANCE = 8.75f;
		int age = 16;
		boolean isOldEnough = true;
    
    // Gina's information
		System.out.print("Gina’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Gina’s weekly allowance is ");
		System.out.println(ALLOWANCE);

		// Carl's information setup & Variable creation
		age = 13;
		isOldEnough = true;
		
		// Carl's Information
		System.out.print("Carl’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Carl’s weekly allowance is ");
		System.out.println(ALLOWANCE);

		// Jennifer's information setup
		ALLOWANCE = 0.0f;
		age = 3;
		isOldEnough = false;
		
		// Jennifer's Information
		System.out.print("Jennifer’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Jennifer’s weekly allowance is ");
		System.out.println(ALLOWANCE);

	}
}
