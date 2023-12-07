
/**
 * Write a description of class AnagramChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AnagramChecker
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
            String first=nums[i].substring(0,nums[i].indexOf("|"));
            String second=nums[i].substring(nums[i].indexOf("|")+1);
            boolean isAnagram=true;
            if (first.equals(second)||first.length()!=second.length()){
                isAnagram=false;
            } else{
                //char[] firstCharArr=first.toCharArray();
                //char[] secondCharArr=second.toCharArray();
                ArrayList<Character> charsF = new ArrayList<Character>();
                for (char c : first.toCharArray()) {
                    charsF.add(c);
                }
                ArrayList<Character> charsS = new ArrayList<Character>();
                for (char c : second.toCharArray()) {
                    charsS.add(c);
                }
                //System.out.println(charsF+"\t\t\t"+charsS);
                for (int q=0; q<charsF.size(); q++){
                    char s=charsF.get(q);
                    int where=charsS.indexOf(s);
                    if (where==-1){
                        isAnagram=false;
                    } else{
                        charsF.remove(q);
                        charsS.remove(where);
                        q--;
                    }
                    
                }
                if (charsF.size()!=0||charsS.size()!=0){
                    isAnagram=false;
                }
            }
            
            if (isAnagram){
                System.out.println(nums[i]+" = ANAGRAM");
            } else{
                System.out.println(nums[i]+" = NOT AN ANAGRAM");
            }
        }
        
    }
}
