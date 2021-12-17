
public class DesignBearingCapacityOfBolts {
	static double calculation(double d,double t, double fu,double p, double fub, double d0, double rmb,double e)
	{
		double kb=1;
		double vdpb=1;
		if (e/(3*d0) < 1 && e/(3*d0) < (p/(3*d0))-0.25 && e/(3*d0) < fub/fu)
		{
			kb = e/(3*d0);
		}
		else if ((p/(3*d0))-0.25 < 1 && (p/(3*d0))-0.25 < e/(3*d0) && (p/(3*d0))-0.25 < fub/fu) 
		{
			kb = (p/(3*d0))-0.25;
		}
		else if (fub/fu < 1 && fub/fu < (p/(3*d0))-0.25 && fub/fu < e/(3*d0))
		{
			kb = fub/fu;
		}
		else
		{
			kb = 1;
		}
		
		vdpb = 2.5 * kb * d * t * fu / rmb;
		return vdpb;
	}
}