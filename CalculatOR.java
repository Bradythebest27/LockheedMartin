
/**
 * Write a description of class CalculatOR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class CalculatOR
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        String[] nums=new String[x];
        for (int i=0; i<x; i++){
             nums[i]=scan.nextLine();
        }
        for (int i=0; i<x; i++){
            String s=nums[i];
            double front=Double.parseDouble(s.substring(0,s.indexOf(" ")));
            double back=Double.parseDouble(s.substring(s.lastIndexOf(" ")+1));
            String sign=s.substring(s.indexOf(" ")+1,s.indexOf(" ")+2);
            if (sign.equals("+")){
                double temp=front+back;
                if (temp>0)
                    temp=((int)(temp*10+0.5))/10.0;
                else{
                    temp=((int)(temp*10-0.5))/10.0;
                }
                System.out.println(temp+" "+temp);
            }
            if (sign.equals("*")){
                double temp=front*back;
                if (temp>0)
                    temp=((int)(temp*10+0.5))/10.0;
                else {
                    temp=((int)(temp*10-0.5))/10.0;
                }
                System.out.println(temp+" "+temp);
            }
            if (sign.equals("-")){
                double temp1=front-back;
                double temp2=back-front;
                if (temp1>0)
                    temp1=((int)(temp1*10+0.5))/10.0;
                else{
                    temp1=((int)(temp1*10-0.5))/10.0;
                }
                if (temp2>0)
                    temp2=((int)(temp2*10+0.5))/10.0;
                else{
                    temp2=((int)(temp2*10-0.5))/10.0;
                }
                System.out.println(temp1+" "+temp2);
            }
            if (sign.equals("/")){
                double temp1=front/back;
                double temp2=back/front;
                if (temp1>0)
                    temp1=((int)(temp1*10+0.5))/10.0;
                else{
                    temp1=((int)(temp1*10-0.5))/10.0;
                }
                if (temp2>0)
                    temp2=((int)(temp2*10+0.5))/10.0;
                else{
                    temp2=((int)(temp2*10-0.5))/10.0;
                }
                System.out.println(temp1+" "+temp2);
            }
        }
    }
}
