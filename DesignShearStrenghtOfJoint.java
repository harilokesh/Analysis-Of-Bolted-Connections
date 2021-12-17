
public class DesignShearStrenghtOfJoint {
	static double calculation(double vdsb, double vdpb, double tdn)
	{
		double designShearStrenght = 1;
		if(vdsb>vdpb && vdsb>tdn)
		{
			designShearStrenght = vdsb;
		}
		else if (vdpb>vdsb && vdpb>tdn)
		{
			designShearStrenght = vdpb;
		}
		else if (tdn>vdpb && tdn>vdsb)
		{
			designShearStrenght = tdn;
		}
		return designShearStrenght;
	}
}
