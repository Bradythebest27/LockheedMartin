
/**
 * Write a description of class BishopMove here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class BishopMove
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        String[] max=new String[x];
        String[] start=new String[x];
        String[] end=new String[x];
        for (int i=0; i<x; i++){
             max[i]=scan.nextLine();
             start[i]=scan.nextLine();
             end[i]=scan.nextLine();
        }
        for (int i=0; i<x; i++){

            int maxR=Integer.parseInt(max[i].substring(0,max[i].indexOf(",")));
            int maxC=Integer.parseInt(max[i].substring(1+max[i].indexOf(",")));
            int startR=Integer.parseInt(start[i].substring(0,start[i].indexOf(",")));
            int startC=Integer.parseInt(start[i].substring(1+start[i].indexOf(",")));
            int endR=Integer.parseInt(end[i].substring(0,end[i].indexOf(",")));
            int endC=Integer.parseInt(end[i].substring(1+end[i].indexOf(",")));
            if (maxR>=startR&&maxR>=endR&&maxC>=startC&&maxC>=endC){
                if ((startR+startC)%2==(endR+endC)%2){
                    System.out.println("Yes");
                } else{
                    System.out.println("No");
                }
            } else{
                System.out.println("No");
            }
            
        }
    }
}
