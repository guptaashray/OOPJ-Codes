class Area
{
	public static void main(String args[])
	{
		double are=0.0;
		int l=args.length;

		if(l==0)
		{
			are=(3.14)*2*2;
		}
		
		else if(l==1)
		{
			int x=Integer.parseInt(args[0]);
			are=x*x;
		}
		
		else if(l==2)
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			are=x*y;
		}
		
		else if(l==3)
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int z=Integer.parseInt(args[2]);	
			are=2*((x*y)+(y*z)+(z*x));
		}
		else
		System.out.println("wrong Input");
		System.out.println("Area is="+are);
	}
}
		
