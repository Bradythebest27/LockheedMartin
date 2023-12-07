
/**
 * Write a description of class AEIOU here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AEIOU
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
            int cool=0;
            for (int y=0; y<s.length(); y++){
                if (s.substring(y,y+1).equalsIgnoreCase("a")||s.substring(y,y+1).equalsIgnoreCase("e")||s.substring(y,y+1).equalsIgnoreCase("i")||s.substring(y,y+1).equalsIgnoreCase("o")||s.substring(y,y+1).equalsIgnoreCase("u")){
                    cool++;
                }
            }
            System.out.println(cool);
        }
    }
}
