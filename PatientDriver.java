package Patient;

public class PatientDriver
{
	public static void main(String args[])
	{
		Patient patient = new Patient("Alvin", "Harvey", "Persaud",
				"123 Main Street", "Clarksburg", "MD", 20871,
				"123-456-7890", "John Hopkins", "987-654-3210");
				
		Procedure procedure1 = new Procedure();
		procedure1.setName("Physical exam");
		procedure1.setDate("02/23/2024");
		procedure1.setPracticioner("George Washington");
		procedure1.setPrice(10000.00);
		
		Procedure procedure2 = new Procedure("X-Ray", "02/23/2024");
		procedure2.setPracticioner("Michael Jackson");
		procedure2.setPrice(17500.00);
		
		Procedure procedure3 = new Procedure("Blood Test", "02/23/2024", "Johnny Law", 25000.00);
		
		displayPatient(patient);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.printf("Total charges: $%,.2f\n", calculateTotalCharges(procedure1, procedure2, procedure3));
		
		System.out.println("\nThis program was developed by: Alvin Persaud\nMC#: M21169763\nDue date: 02/23/2024");
	}
	
	public static void displayPatient(Patient patient)
	{
		System.out.println(patient);
	}
	public static void displayProcedure(Procedure procedure)
	{
		System.out.println(procedure);
	}
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3)
	{
		return (procedure1.getPrice() + procedure2.getPrice() + procedure3.getPrice());
	}
}