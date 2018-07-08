public class loopping {

	public static void main(String[] args) {
		int max_loop = 5;
		int a = 1, b, c, d;
		
		while(a <= max_loop)
		{
			b = 1;
			while(b <= a)
			{
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
			a++;
		}
		
		c = max_loop-1;
		while(c >= 1)
		{
			d = 1;
			while(d <= c)
			{
				System.out.print(d+" ");
				d++;
			}
			System.out.println();
			c--;
		}
		
	}
	

}