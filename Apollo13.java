
/**
 * Write a description of class Apollo13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Apollo13
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int nums=scan.nextInt();
        scan.nextLine();
        String t;
        int x,b;
        double one, two, three;
        String a,s,d;
        for (int i=0; i<nums; i++){
            t=scan.nextLine();
            x=t.indexOf(" ");
            b=t.lastIndexOf(" ");
            one=Double.parseDouble(t.substring(0,x));
            two=Double.parseDouble(t.substring(x+1,b));
            three=Double.parseDouble(t.substring(b+1));
            if (one>=180){
                one-=180;
                one=(int)(one*100+0.5)/100.0;
            }   else{
                one+=180;
                one=(int)(one*100+0.5)/100.0;
            }
            if (two>=180){
                two-=180;
                two=(int)(two*100+0.5)/100.0;
            }   else{
                two+=180;
                two=(int)(two*100+0.5)/100.0;
            }
            if (three>=180){
                three-=180;
                three=(int)(three*100+0.5)/100.0;
            }   else{
                three+=180;
                three=(int)(three*100+0.5)/100.0;
            }
            //leading and trailing zeros
            a=one+"";
            s=""+two;
            d=""+three;
            
            for (int p=a.indexOf("."); p<3; p++){
                a="0"+a;
            }
            for (int p=s.indexOf("."); p<3; p++){
                s="0"+s;
            }
            for (int p=d.indexOf("."); p<3; p++){
                d="0"+d;
            }
            if(a.length()<6){
                a=a+"0";
            }
            if(s.length()<6){
                s=s+"0";
            }
            if(d.length()<6){
                d=d+"0";
            }
            
            
            
            System.out.println(a+" "+s+" "+d);
        }
    }
}
