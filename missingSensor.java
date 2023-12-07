
/**
 * Write a description of class missingSensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class missingSensor
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        for (int i=0; i<x; i++){
            int total=scan.nextInt();
            scan.nextLine();
            ArrayList<Integer> nums=new ArrayList<Integer>();
            for (int j=0; j<total-1; j++){
                nums.add(scan.nextInt());
            }
            for (int k=1; k<=total; k++){
                if (!nums.contains(k)){
                    System.out.println(k);
                }
            }
        }
    }
}
