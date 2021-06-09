package surenabankapp1;

public class CalculateSimpleInterest {
	double p=100000.0;
	float r=2.0f;
	int t=12;
	public void calculateSI()
	{
		double si=(p*t*r)/100;
		System.out.println("SimpleInterest:"+si);
		double total=si+p;
		System.out.println("Total Amount:"+total);
	}
	

}
