package gisele;

public class GISELE {

	public static void main(String[] args) {


		int a = 5;
		int b = 3;
		
		//a)
		System.out.println(b = a* (a++));
		
		a=5;
		b=3;
		
		//b)
		System.out.println(b = a* (--a));
		
		a=5;
		b=3;
		//c)
		System.out.println(b = a * ++a);
		
		a=5;
		b=3;
		//d)
		System.out.println(b = a * a--);
		
		a=5;
		b=3;
		//e)
		System.out.println(a += b++);
	
		a=5;
		b=3;
		//f)
		System.out.println(a += --b);
		
		a=5;
		b=3;
		
		//g)
		System.out.println(a= b++ * ++a);
		
		a=5;
		b=3;
		
		//h)
		System.out.println(a = (b++ % 2 ) * (++a *3));
		
		a=5;
		b=3;
		
		//i)
		System.out.println(a = (--b % 2 ) * (++a /3 * b++));
		
		a=5;
		b=3;
		
		//j)
		System.out.println(b = (a * ++a) / (a * ++a));
		
		
		
		
	
	
	}

}
