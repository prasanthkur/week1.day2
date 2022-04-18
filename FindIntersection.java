package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int [] a= {3,4,5,6,5};
		int [] b= {2,1,9,6,5};
		int m=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[i])
				{
					m=a[i];
					System.out.println("The matching values form the firts array are" +m);
					break;
					
							
				}
			}
		}

	}

}
