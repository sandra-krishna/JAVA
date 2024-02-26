class CPU
{
	double price;
	class Processor
	{
		double cores;
		String manufacturer;
		double getCache()
		{
			return 4.3;
		}
	}
	protected class RAM
	{
		double memory;
		String manufacturer;
		double getClockSpeed()
		{
			return 5.5;
		}
	}
}
public class CPUDetails
{
	public static void main(String[] args)
	{
	System.out.println("Sandra Krishna P S \n Roll No: 46 \n 14/2/2024 \n CPU Details");
	CPU cpu=new CPU();
	CPU.Processor processor=cpu.new Processor();
	CPU.RAM ram=cpu.new RAM();
	System.out.println("Processor Cache=" + processor.getCache());
	System.out.println("Ram Clock speed" + ram.getClockSpeed());
	}
}
