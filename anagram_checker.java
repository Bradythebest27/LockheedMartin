
/**
 * Write a description of class anagram_checker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class anagram_checker
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
            boolean bool=true;
            int cool=s.indexOf("|");
            for (int y=0; y<cool; y++){
                if (!s.substring(y,y+1).equals(s.substring(2*cool-y,2*cool-y+1))){
                    bool=false;
                }
            }
            if (bool)
                System.out.println(s+ " = ANAGRAM");
            else{
                System.out.println(s+ " = NOT AN ANAGRAM");
            }
        }
    }
}
