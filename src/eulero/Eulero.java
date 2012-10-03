/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eulero;

import java.io.IOException;

/**
 *
 * @author gio
 */
public class Eulero 
{
    static int x =555;
    static int a = 0, b = 0, c = 0, d = 0;
    static int matrix1[] = new int[x];
    static int matrix2[] = new int[x];
    static int matrix3[] = new int[x];
    static int matrix4[] = new int[x];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        //x = System.in.read();
        int k = 0;
        while (k < x)
        {
            matrix1[k]=k;
            matrix2[k]=k;
            matrix3[k]=k;
            matrix4[k]=k;
            k = k+1;
        }

        //while (x != a*a + b*b + c*c + d*d)
        //{
          
        //}
        while (3 == 3)
        {
            a = matrix1[ReturnRNDNorm(x)];
            b = matrix2[ReturnRNDNorm(x)];
            c = matrix3[ReturnRNDNorm(x)];
            d = matrix4[ReturnRNDNorm(x)];
            if (x == ((a*a) + (b*b) + (c*c) + (d*d)))
            {
                System.out.println("soluzione trovata: " + "a=" + a + " " + "b=" + b + " " + "c=" + c + " " + "d=" + d );
            }
            //System.out.println(ReturnRNDNorm(5));
            //System.out.println(a);
            
        }
        
    }
    
    public static int ReturnRNDNorm(int max)
    {
        double p = Math.random();
        int l;
        l = (int) (p*(max));
        return l;
    }
}
