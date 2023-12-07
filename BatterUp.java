
/**
 * Write a description of class BatterUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class BatterUp
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        String[] nums=new String[x];
        for(int i=0; i<x; i++){
            nums[i]=scan.nextLine();
        }
        for (int i=0; i<x; i++){
            String name=nums[i].substring(0,nums[i].indexOf(":"));
            System.out.print(name+"=");
            String s=nums[i].substring(nums[i].indexOf(":")+1);
            s=returnTheAmount(s);
            double score=0;
            double atBats=0;
            //char[] easy=s.toCharArray();
            for (int q=0; q<s.length(); q++){
                if (s.charAt(q)=='1'){
                    score+=1;
                    atBats+=1;
                } else if(s.charAt(q)=='2'){
                    score+=2;
                    atBats+=1;
                }else if(s.charAt(q)=='3'){
                    score+=3;
                    atBats+=1;
                } else if(s.charAt(q)=='4'){
                    score+=4;
                    atBats+=1;
                } else if(s.charAt(q)=='K'){
                    atBats+=1;
                } else if(s.charAt(q)=='B'){
                    
                } else{
                    System.out.println("error");
                }
            }
            if (atBats!=0&&score!=0){
                double ops=(score/atBats);
                ops=(((int)(ops*1000+0.5))/1000.0)+0.0001;
                String out=""+ops;
            
                System.out.println(out.substring(0,out.length()-1));
            } else{
                System.out.println("0.000");
            }
        }
    }
    public static String returnTheAmount(String input){
        boolean truth=true;
        
            if (input.indexOf(",")!=-1){
                if(input.substring(0,input.indexOf(",")).equals("1B")){
                    return("1"+returnTheAmount(input.substring(input.indexOf(",")+1)));
                } else if(input.substring(0,input.indexOf(",")).equals("2B")){
                    return("2"+returnTheAmount(input.substring(input.indexOf(",")+1)));
                } else if(input.substring(0,input.indexOf(",")).equals("3B")){
                    return("3"+returnTheAmount(input.substring(input.indexOf(",")+1)));
                } else if(input.substring(0,input.indexOf(",")).equals("HR")){
                    return("4"+returnTheAmount(input.substring(input.indexOf(",")+1)));
                } else if(input.substring(0,input.indexOf(",")).equals("BB")){
                    return("B"+returnTheAmount(input.substring(input.indexOf(",")+1)));
                } else {//if(input.substring(0,input.indexOf(",")).equals("K")){
                    return("K"+returnTheAmount(input.substring(input.indexOf(",")+1)));
                }
            } else{
                if(input.equals("1B")){
                    return("1");
                } else if(input.equals("2B")){
                    return("2");
                } else if(input.equals("3B")){
                    return("3");
                } else if(input.equals("HR")){
                    return("4");
                } else if(input.equals("BB")){
                    return("B");
                } else {//if(input.substring(0,input.indexOf(",")).equals("K")){
                    return("K");
                }
            }
        
    }
}
