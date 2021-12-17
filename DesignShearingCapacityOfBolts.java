
public class DesignShearingCapacityOfBolts {
	static double calculation(double fub, double rmb, int planes, double d)
	{
		
		double nn;
		double ns;
		double asb;
		double anb;
		double vdsb = 1;
		if(planes == 1)
		{
			nn = 1.0;
			ns = 0.0;
			asb = 3.141 * d * 0.25;
			anb = 0.78 * asb;
			vdsb = (fub* ( nn * anb + ns * asb)) / (1.732 * rmb);
		}
		if(planes == 2)
		{
			nn = 1.0;
			ns = 1.0;
			asb = 3.141 * d * 0.25;
			anb = 0.78 * asb;
			vdsb = (fub* ( nn * anb + ns * asb)) / (1.732 * rmb);
		}
		return vdsb;
	}
}
