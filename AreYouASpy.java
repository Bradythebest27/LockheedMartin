
/**
 * Write a description of class AreYouASpy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AreYouASpy
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        String[] nums=new String[x];
        String[] first=new String[x];
        String[] second=new String[x];
        for (int i=0; i<x; i++){
            nums[i]=scan.nextLine();
            first[i]=nums[i].substring(0,nums[i].indexOf("|"));
            second[i]=nums[i].substring(nums[i].indexOf("|")+1);
        }
        for (int i=0; i<x; i++){
            ArrayList<String> cool=new ArrayList<String>();
            ArrayList<String> cool2=new ArrayList<String>();
            for (int w=0; w<first[i].length();w++){
                if (((int)(first[i].charAt(w))>=65&&(int)(first[i].charAt(w))<91)||((int)(first[i].charAt(w))>=97&&(int)(first[i].charAt(w))<122))
                    cool.add((first[i].substring(w,w+1)).toUpperCase());
                    
            }
            for (int w=0; w<second[i].length();w++){
                if (((int)(second[i].charAt(w))>=65&&(int)(second[i].charAt(w))<91)||((int)(second[i].charAt(w))>=97&&(int)(second[i].charAt(w))<122)){
                    //System.out.println((int)(second[i].charAt(w)));
                    cool2.add(second[i].substring(w,w+1).toUpperCase());
                }else {
                    //System.out.println("                "+second[i].charAt(w));
                }
            }
            Collections.sort(cool);
            Collections.sort(cool2);
            Object[] st = cool.toArray();
            for (Object s : st) {
                if (cool.indexOf(s) != cool.lastIndexOf(s)) {
                    cool.remove(cool.lastIndexOf(s));
                }
            }
            Object[] st1 = cool2.toArray();
            for (Object s : st1) {
                if (cool2.indexOf(s) != cool2.lastIndexOf(s)) {
                    cool2.remove(cool2.lastIndexOf(s));
                }
            }
            int p=cool2.size();
            boolean truth=true;
            for (int n=0; n<p; n++){
                if (first[i].indexOf(Character.toUpperCase(second[i].charAt(n)))<0&&first[i].indexOf(Character.toLowerCase(second[i].charAt(n)))<0){
                    truth=false;
                    //System.out.println(first[i]+second[i].charAt(n));
                }
                
            }
            if (truth){
                System.out.println("That's my secret contact!");
            } else {
                System.out.println("You're not a secret agent!");
            }
        }
    }
}
