package getUp;

import java.util.Scanner;

/**
 * Created by Caffrey on 2017/8/9.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int nM = scanner.nextInt();
        int nH = scanner.nextInt();
        int getUpMin = scanner.nextInt();
        int getUpMax = scanner.nextInt();
        int[] xm = new int[nM * 2 ];
        for(int i=0;i<nM*2;i++)
        {
            xm[i] = scanner.nextInt();
        }
        int[] xh = new int[nH * 2];
        for(int i=0;i<nH*2;i++)
        {
            xh[i] = scanner.nextInt();
        }
        int num = 0;
       /* for(int k=0;k<xm.length;k=k+1)
        {
            System.out.println(xm[k]);

        }
        for(int j=0;j<xh.length;j=j+1)
        {
            System.out.println(xh[j]);

        }*/
        for(int i=getUpMin;i<=getUpMax;i++)
        {
            a:for(int k=0;k<xm.length-1;k=k+1)
            {
                for(int j=0;j<xh.length-1;j=j+1)
                {
                    //System.out.println(getJ(xm[k],xm[k+1],xh[j]+i,xh[j+1]+i)+" "+xm[k]+" "+xm[k+1]+" "+(xh[j]+i)+" "+(xh[j+1]+i)+" ");
                    if(getJ(xm[k],xm[k+1],xh[j]+i,xh[j+1]+i)==1)
                    {
                        num++;
                        break a;
                    }
                    j++;
                }
                k++;
            }

        }
        System.out.println(num);
    }

    public static int  getJ(int a,int b, int c,int d)
    {
        if( c > b  ||  a > d)
        {
            return 0;
        }
        else
            return 1;
    }

}
