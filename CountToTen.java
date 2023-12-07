
/**
 * Write a description of class CountToTen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class CountToTen
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
            
                int pouiy =(int)Math.pow(2,nums[i]);
                for (int e=0; e<pouiy; e++){
                    String o=Integer.toBinaryString(e);
                    while (o.length()<nums[i]){
                        o="0"+o;
                    }
                    System.out.println(o);
                }
            
        }
    }
    
}
