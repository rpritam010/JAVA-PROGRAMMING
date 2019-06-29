public class largestsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n={2,55,12,98,57,122};
		int maxone=0;
		int maxtwo=0;
		for(int i=0;i<n.length;i++)
		{
			if(maxone<n[i])
			{
				maxtwo=maxone;
				maxone=n[i];
			}
			else if(maxtwo<n[i])
			{
				maxtwo=n[i];
			}
		}
		System.out.println("largest number :"+maxone);
		System.out.println("secondlargest number:"+maxtwo);

	}

}
