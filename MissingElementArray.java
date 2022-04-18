package week1.day2;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,6,5};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			int missing=i+1;
			if(missing!=arr[i])
			{
				System.out.println("missing element is " + missing);
				break;
			}
		}
	}
}

