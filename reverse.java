import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		s=scan.next();
		char []y=s.toCharArray();
		int size = y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			i++;
		}
		System.out.println(a);

	}

}
