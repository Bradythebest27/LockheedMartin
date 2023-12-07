
/**
 * Write a description of class AplusB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AplusB
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        int[] nums=new int[x];
        for (int i=0; i<x; i++){
            nums[i]=scan.nextInt();
        }
        int times=0;
        for (int i=0; i<x; i++){
            for (int j=i+1; j<x; j++){
                    for (int k=0; k<x; k++){
                            if (nums[i]+nums[j]==nums[k]){
                                times+=2;
                            }
                    }
            }
        }
        System.out.println(times);
    }
}
