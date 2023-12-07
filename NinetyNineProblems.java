
/**
 * Write a description of class NinetyNineProblems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class NinetyNineProblems
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        if (x<100){
            System.out.println(99);
        } else{
            
            int upAmount=0;
            int downAmount=0;
            boolean whileTrue=true;
            while (whileTrue){
                if ((x+upAmount)%100==99){
                    whileTrue=false;
                    System.out.println(x+upAmount);
                } else if ((x-downAmount)%100==99){
                    whileTrue=false;
                    System.out.println(x-downAmount);
                } else{
                    upAmount++;
                    downAmount++;
                }
            }
        }
        
    }
}
