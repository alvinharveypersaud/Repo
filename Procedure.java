package Patient;

public class Procedure
{
	private String name, date, practicioner;
	private double price;
	
	public Procedure()
	{
		name = "";
		date = "";
		practicioner = "";
		price = 0.0;
	}
	public Procedure(String name, String date)
	{
		this.name = name;
		this.date = date;
		practicioner = "";
		price = 0.0;
	}
	public Procedure(String name, String date, String practicioner, double price)
	{
		this.name = name;
		this.date = date;
		this.practicioner = practicioner;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date) 
	{
		this.date = date;
	}
	public String getPracticioner()
	{
		return practicioner;
	}
	public void setPracticioner(String practicioner)
	{
		this.practicioner = practicioner;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String toString()
	{
		return "\tProcedure: " + name + "\n\tDate: " + date + "\n\tPracticioner: " + practicioner + "\n\tPrice: " + price + "\n";
	}
}