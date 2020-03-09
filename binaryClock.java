import java.util.Scanner;
/**
 * Binary Clock program that reads line by line.
 * First insert the number of cases that you wish to test out and hit enter.
 * Then type out the case and hit enter, the program will return the time in decimal format.
 * Repeat this process until the all cases have been converted from sexagesimal to decimal.
 *
 * @Saulo Bosquez
 * v1.1
 */
public class binaryClock
{
    public static void main()
    {
        System.out.print('\u000c');
        String totalHrs;
        String actualTime=Integer.toString(0);
        String actualTime1=Integer.toString(0);
        Scanner datos=new Scanner(System.in);
        int num=datos.nextInt();
        for (int i=1;i<=num;i++)
        {
            Scanner address=new Scanner(System.in);
            String tOD=address.nextLine();
            String hrsBin1=tOD.replace("()","0");
            String hrsBin=hrsBin1.replace("(*)","1");
            int hr1=Integer.parseInt(hrsBin.substring(0,2),2);
            String hrTen=Integer.toString(hr1);
            int hr2=Integer.parseInt(hrsBin.substring(2,6), 2);
            String hrOne=Integer.toString(hr2);
            int hr3=Integer.parseInt(hrsBin.substring(6,9), 2);
            String minTen=Integer.toString(hr3);
            int hr4=Integer.parseInt(hrsBin.substring(9,13), 2);
            String minOne=Integer.toString(hr4);
            int hr5=Integer.parseInt(hrsBin.substring(13,16), 2);
            String secTen=Integer.toString(hr5);
            int hr6=Integer.parseInt(hrsBin.substring(16), 2);
            String secOne=Integer.toString(hr6);
            System.out.println("Case "+i+": "+hrTen+hrOne+":"+minTen+minOne+":"+secTen+secOne);
        }
    }
}