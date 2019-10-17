public class Main {

	public static void main(String args[]) {
		
		double area;
		
		if(args.length==0) {
			area = 3.14*2*2;
		}
		else if (args.length==1) {
			int a = Integer.parseInt(args[0]);			
			area = a*a;
		}
		else if (args.length==2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			area = a*b;
		}
		else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			area = 2*(a*b+b*c+a*c);
			
			
		}
		System.out.println("Area is" + area);
	}

}
