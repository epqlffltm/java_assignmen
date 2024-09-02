package progect;

public class gugudan {
	public static void mul(int i,int j)
	{
		System.out.println(i+" * "+j+" = "+i*j);
	}

	public static void main(String[] args) {
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				mul(i,j);
			}
			System.out.printf("\n");
		}
	}

}
