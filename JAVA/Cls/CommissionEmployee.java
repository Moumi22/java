public class CommissionEmployee extends Object 
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double commmissionRate;
	
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commmissionRate)
	
	{
		if (grossSales < 0.0)
			throw new  IllegalArgumentException("Grow sales must be >=0.0");
		
	    if (commmissionRate <= 0.0 || commmissionRate >= 1.0)
		    throw new  IllegalArgumentException("Commission rate must be > 0.0 and 1.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commmissionRate = commmissionRate;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}
	public void setGrossSales(double grossSales)
	{
		if (grossSales <0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		this.grossSales = grossSales;
	}
	public double getGrossSales()
	{
		return grossSales;
	}
	public void setCommissionRate(double commmissionRate)
	{
		if (commmissionRate <= 0.0 || commmissionRate>= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		this.commmissionRate = commmissionRate;
	}
	public double getCommissionRate()
	{
	    return commmissionRate;
	}
	public double earnings()
	{
		return commmissionRate * grossSales;
	}
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commmission employee", firstName, lastName, "social security number", socialSecurityNumber, "gross sales", grossSales, "commmission rate", commmissionRate);
	}
}
	