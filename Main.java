import java.util.Scanner;
public class Main
{
    static double det2(double[][] mat2)
    {
        return mat2[0][0]*mat2[1][1]-mat2[0][1]*mat2[1][0];
    }
    static double det3(int n)
    {
        Scanner read = new Scanner(System.in);
        double deter=0;
        System.out.println("Matrix element: ");
		double[][] mat = new double[n][n];
		for(int c=0;c<n;c++)
		{
		    for(int m=0;m<n;m++)
		    {
		        mat[c][m]=read.nextDouble();
		    }
		}
		double[][][][] zm = new double[n-2][][][];
		for(int c=1;c<=n-2;c++)
		{
		    int a=1;
		    for(int m=0;m<c;m++)
		    {
		        a*=n-m;
		    }
		    zm[n-2-c]=new double[a][n-c][n-c];
		}
        for(int b=0;b<n;b++)
        {
            for(int c=0;c<n-1;c++)
            {
                int d2=0;
                for(int d1=0;d1<n;d1++)
                {
                    if(d1!=b)
                    {
                        zm[n-3][b][c][d2]=mat[c+1][d1];
                        d2++;
                    }
                }
            }
        }
		for(int c=0;c<3;c++)
		{
		    deter+=Math.pow(-1,2+c)*mat[0][c]*det2(zm[0][c]);
		}
		return deter;
    }
    static double det(int n)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Matrix element: ");
		double[][] mat = new double[n][n];
		for(int c=0;c<n;c++)
		{
		    for(int m=0;m<n;m++)
		    {
		        mat[c][m]=read.nextDouble();
		    }
		}
		double[][][][] zm = new double[n-2][][][];
		for(int c=1;c<=n-2;c++)
		{
		    int a=1;
		    for(int m=0;m<c;m++)
		    {
		        a*=n-m;
		    }
		    zm[n-2-c]=new double[a][n-c][n-c];
		}
		int q=1;
		for(int c=0;c<=n-4;c++)
		{
		    q*=n-c;
		}
		double[] xj=new double[q];
        for(int b=0;b<n;b++)
        {
            for(int c=0;c<n-1;c++)
            {
                int d2=0;
                for(int d1=0;d1<n;d1++)
                {
                    if(d1!=b)
                    {
                        zm[n-3][b][c][d2]=mat[c+1][d1];
                        d2++;
                    }
                }
            }
        }
		for(int a=0;a<=n-4;a++)
		{
		    q=1;
		    for(int m=0;m<a+2;m++)
		    {
		        q*=n-m;
		    }
		    int b2=-1;
		    for(int b1=0;b1<q;b1++)
		    {
		        if(b1%(n-1-a)==0)
		            b2++;
		        for(int c=0;c<n-a-2;c++)
		        {
		            int d2=0;
		            for(int d1=0;d1<n-a-1;d1++)
		            {
		                if(b1%(n-1-a)!=d1)
		                {
		                    zm[n-4-a][b1][c][d2]=zm[n-3-a][b2][c+1][d1];
		                    d2++;
		                }
		            }
		        }
		    }
		}
		int z=-1;
        q=1;
        for(int m=0;m<=n-3;m++)
        {
            q*=n-m;
        }
		for(int c=0;c<q;c++)
		{
		    if(c%3==0)
		    {
		        z++;
		        xj[z]+=Math.pow(-1,1+1)*zm[1][z][0][0]*det2(zm[0][c]);
		    }
		    if(c%3==1)
		    {
		        xj[z]+=Math.pow(-1,1+2)*zm[1][z][0][1]*det2(zm[0][c]);
		    }
		    if(c%3==2)
		    {
		        xj[z]+=Math.pow(-1,1+3)*zm[1][z][0][2]*det2(zm[0][c]);
		    }
		}
		int o=1;
        q=1;
        for(int m=0;m<=n-4;m++)
        {
            q*=n-m;
        }
		for(int a=4;a<=n-1;a++)
		{
		    int b2=-1*(a*o);
		    int d=0;
		    for(int b1=0;b1<q;b1+=o)
		    {
		        if(b1%a==0)
		        {
		            b2+=o*a;
		            d=0;
		            xj[b2]*=Math.pow(-1,1+d+1)*zm[a-2][b2/(o*a)][0][d];
		        }
		        else
		        {
		            d++;
		            xj[b2]+=xj[b1]*Math.pow(-1,1+d+1)*zm[a-2][b2/(o*a)][0][d];
		        }
		    }
		    o*=a;
		}
		for(int a=0;a<n;a++)
		{
		    if(a==0)
		        xj[0]*=Math.pow(-1,2+a)*mat[0][a];
		    else
		        xj[0]+=xj[a*o]*Math.pow(-1,2+a)*mat[0][a];
		}
		return xj[0];
    }
	public static void main(String[] args)
	{
	    Scanner read = new Scanner(System.in);
		System.out.println("Matrix rank: ");
		int n=read.nextInt();
		if(n==2)
		{
		    System.out.println("Matrix element: ");
		    double[][] mat = new double[n][n];
		    for(int c=0;c<n;c++)
		    {
		        for(int m=0;m<n;m++)
		        {
		            mat[c][m]=read.nextDouble();
		        }
		    }
		    System.out.println("Determinant = "+det2(mat));
		}
		else
		    if(n==3)
		        System.out.println("Determinant = "+det3(n));
		else
		    System.out.println("Determinant = "+det(n));
	}
}