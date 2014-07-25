public class PaintBoard
{
	public static void main(String args[])
	{
	int[] a = {1,2,3,4,5,6,7,8,9,10};
	IntHolder intHolder	= new IntHolder();
	paintboard2(a,0,a.length-1);
	}

	public static void paintboard1(int[] a)
	{
	int cost1=0;
	for (int j = 0; j < a.length; j++)
		{
		cost1++;
		}
	System.out.println("No. of painting assignments in approach _No1 = "+cost1+"\n");
	}

	public static void paintboard2(int[] a,int b,int c)
	{
	IntHolder.iteration_No++;
	System.out.println("iteration_No= "+IntHolder.iteration_No);
	int b1 = b; int c1 = c; int mid = 0;
	if (b1 != c1)
		{
		mid=(b1+c1)/2;
		paintboard2(a,b1,mid);
		paintboard2(a,mid+1,c1);
			/*
	1	paintboard2(a,b1=0,c1=9);
	2		paintboard2(a,b1=0,mid=4);
	3		 paintboard2(a,b1=0,mid=2);
	4		  paintboard2(a,b1=0,mid=1);
	*5		   paintboard2(a,b1=0,mid=0);
	*6		   paintboard2(a,b1=0+1,mid=1);
	*7		  paintboard2(a,1+1,mid=2);
	8		 paintboard2(a,2+1,mid=4);
	*9		  paintboard2(a,3,mid=3);
	10		  paintboard2(a,4,mid=4);
	11		   paintboard2(a,4,mid=3);
	12		   paintboard2(a,5,mid=3);
	13		paintboard2(a,4+1,c1=9);
	14		 paintboard2(a,5,c1=7);
	15		  paintboard2(a,5,c1=6);
	*16		   paintboard2(a,5,c1=5);
	*17		   paintboard2(a,6,c1=6);
	18		  paintboard2(a,6,c1=7);
	*19		   paintboard2(a,6,c1=6);
	*20		   paintboard2(a,7,c1=7);
	21		 paintboard2(a,6,c1=9);
	22		  paintboard2(a,6,c1=7);
	*23		   paintboard2(a,6,c1=6);
	*24		   paintboard2(a,7,c1=7);
	25		  paintboard2(a,8,c1=9);
	*26		   paintboard2(a,8,c1=8);
	*27		   paintboard2(a,9,c1=9);
			*/
		}

	if (b1 == c1)
		{
		System.out.println("Latter:"+a[b1]);
		}
	}

}
class IntHolder
{
static int iteration_No = 0;
}