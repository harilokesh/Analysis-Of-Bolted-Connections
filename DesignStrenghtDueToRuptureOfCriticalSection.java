
public class DesignStrenghtDueToRuptureOfCriticalSection {
	static double calculation(double rml,double fu,double d0,double b, double t, double n)
	{
		double tdn;
		double an = (b - n * d0) * t;
		tdn = 0.9 * an * fu / rml;
		return tdn;
		}
}
