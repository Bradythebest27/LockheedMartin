
/**
 * Write a description of class AnimalFarm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AnimalFarm
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        int[] nums=new int[x];
        for (int i=0; i<x; i++){
            nums[i]=scan.nextInt()*2+scan.nextInt()*4+scan.nextInt()*4;
            scan.nextLine();
        }
        for(int i=0; i<x; i++){
            System.out.println(nums[i]);
        }
    }
}
