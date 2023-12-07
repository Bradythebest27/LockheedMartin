
/**
 * Write a description of class AroundAndAround here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AroundAndAround
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        int[] nums=new int[x];
        for(int i=0; i<x; i++){
            nums[i]=scan.nextInt();
        }
        for(int i=0; i<x; i++){
            double add=nums[i];
            double diam=40075.0/Math.PI;
            diam+=add+add;
            double raw=Math.PI*diam;
            raw=((int)(raw*10+0.5))/10.0;
            System.out.println(raw);
        }
    }
}
