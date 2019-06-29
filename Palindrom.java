import java.util.*;
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
				s=scan.next();
				s.replace(" ", "");
				s.toLowerCase();
				char[]a=s.toCharArray();
				int size = a.length;
				char y[]=new char[size];
				int i=0;
				while(i!=size)
				{
					y[size-1-i]=a[i];
					++i;
				}
				i=0;
				while(i!=size)
				{
					if(y[i]!=a[i])
					{
						System.out.println("it is not a palindrome");
								System.exit(0);
					}
					else
					{
						++i;
						continue;
					}
				}
				System.out.println("It is a palindrome");
		

	}

}
