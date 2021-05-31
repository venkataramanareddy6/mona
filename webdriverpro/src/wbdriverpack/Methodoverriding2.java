package wbdriverpack;

public class Methodoverriding2 //extends MethodOverriding
{
	public void add(int a, int b)
	{
		int result=a-b;
		System.out.println(" Substraction of a-b :"+ result);
	}

	public static void main(String[] args)
	{
		Methodoverriding2 r = new Methodoverriding2();
		r.add(20, 30);
	}

	


}
