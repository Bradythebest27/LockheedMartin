
/**
 * Write a description of class BishopMove here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AVirtualIssue
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        Double[] one=new Double[x];
        Double[] two=new Double[x];
        Double[] three=new Double[x];
        int[] four=new int[x];
        String s;
        //console.log(x);
        final double TARGETFRAMTIME=(1000)/90.0;
        final double low=TARGETFRAMTIME*0.7;
        final double extrapolated=TARGETFRAMTIME*0.85;
        final double high=TARGETFRAMTIME*0.9;
        // System.out.println(high);
        for (int i=0; i<x; i++){
             s=scan.nextLine();
             one[i]=Double.parseDouble(s.substring(0,s.indexOf(".")+2));
             two[i]=Double.parseDouble(s.substring(s.indexOf(" ")+1,s.indexOf(" ",s.indexOf(" ")+1)));
             three[i]=Double.parseDouble(s.substring(1+s.indexOf(" ",s.indexOf(" ")+1),s.lastIndexOf(" ")));
             four[i]=Integer.parseInt(s.substring(s.lastIndexOf(" ")+1));
        }
        for (int i=0; i<x; i++){
            if ((three[i]>high)){
                four[i]-=2;
                //System.out.println("AA");
            }   else if(three[i]>extrapolated){
                double extrapone=one[i]+(three[i]-one[i])/2*3;
                double extraptwo=two[i]+(three[i]-two[i])*2;
                if (extrapone>high||extraptwo>high){
                    four[i]-=2;
                }
                
                //System.out.println(extrapone+" "+extraptwo);
            }   else if(one[i]<low&&two[i]<low&&three[i]<low){
                four[i]+=1;
                //System.out.println("CC");
            }
            if (four[i]>10){
                System.out.println(10);
            } else if (four[i]<1){
                System.out.println(1);
            } else{
            
                System.out.println(four[i]);
            }
        }
    }
}