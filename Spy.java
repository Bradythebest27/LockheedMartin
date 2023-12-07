
/**
 * Write a description of class Spy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Spy
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        String[] nums=new String[x];
        for(int i=0; i<x; i++){
            nums[i]=scan.nextLine().toUpperCase();
        }
        for(int i=0; i<x; i++){
            String first=nums[i].substring(0,nums[i].indexOf("|"));
            String second=nums[i].substring(nums[i].indexOf("|")+1);
            
            boolean isSpy=true;
            
        
            ArrayList<Character> charsF = new ArrayList<Character>();
            for (char c : first.toCharArray()) {
                if (Character.isLetter(c))
                charsF.add(c);
            }
            ArrayList<Character> charsS = new ArrayList<Character>();
            for (char c : second.toCharArray()) {
                if (Character.isLetter(c))
                charsS.add(c);
            }
           
            for (int q=0; q<charsS.size(); q++){
                char s=charsS.get(q);
                int where=charsF.indexOf(s);
                if (where==-1){
                    isSpy=false;
                }
            }
            if (isSpy){
                System.out.println("That's my secret contact!");
            }else{
                System.out.println("You're not a secret agent!");
            }
        }
    }
}
