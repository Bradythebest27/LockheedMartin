
/**
 * Write a description of class ColorWheel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ColorWheel
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
            for (int j=0;j<s.length()-5; j++){
                if (s.substring(j,j+6).equalsIgnoreCase("ORANGE")){
                    System.out.println("In order to make "+s+", red and yellow must be mixed.");
                }
            }
            for (int j=0;j<s.length()-5; j++){
                if (s.substring(j,j+6).equalsIgnoreCase("Violet")){
                    System.out.println("In order to make "+s+", blue and red must be mixed.");
                }
            }
            for (int j=0;j<s.length()-4; j++){
                if (s.substring(j,j+5).equalsIgnoreCase("Green")){
                    System.out.println("In order to make "+s+", blue and yellow must be mixed.");
                }
            }
            if (s.equalsIgnoreCase("yellow")||s.equalsIgnoreCase("red")||s.equalsIgnoreCase("blue")){
                System.out.println("No colors need to be mixed to make "+s+".");
            }
        }
    }
}
