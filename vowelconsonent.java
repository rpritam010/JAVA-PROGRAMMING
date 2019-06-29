
public class vowelconsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="this is me3.";
		int vowels=0 ,consonent=0 ,digits=0,space=0;
		p=p.toLowerCase();
		for(int i=0;i<p.length();++i)
		{
			char ch =p.charAt(i);
			if(ch== 'a' || ch== 'e' || ch=='i' || ch== 'o' || ch== 'u')
			{
				++vowels;
			}
			else if(ch >= 'a' && ch <='z')
			{
				++consonent;
			}
			else if(ch >= '0' && ch<= '9')
			{
				++digits;
			}
			else if(ch ==' ')
			{
				++space;
			}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("consonents:"+consonent);
		System.out.println("digit:"+digits);
		System.out.println("space:"+space);

	}

}
