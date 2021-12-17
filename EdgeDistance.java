
public class EdgeDistance {
	static double calculation( double d, String cut)
	{
		double e = 1;
		if(cut.equalsIgnoreCase("hand"))
		{
			e = 1.7 * d ;
		}else if(cut.equalsIgnoreCase("machine"))
		{
			e = 1.5 * d ;
		}else 
		{
			System.out.println("invalid input");
		}
		return e;
	}

}
