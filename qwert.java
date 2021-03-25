
public class qwert
{
    public static void main(String args[])
    {
        double rSi=7.85;
        double rCi=7.80;
        int p=10000;
        int t=5;
        double si=(p*t*rSi)/100;
        si=si+p;
        double ci=(double)p*Math.pow((1+rCi/100),t);
        int a=(int)si;
        int b=(int)ci;
        System.out.println("Si is"+a);
        System.out.println("Ci is"+b);
        if(a>b)
        System.out.println("si is greater");
        else if(a<b)
        System.out.println("ci is greater");
        else
        System.out.println("Both are equal");
    }
}
