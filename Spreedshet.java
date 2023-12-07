/**
 * Write a description of class Spreedshet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Spreedshet
{
    public static void main(String[] args){
        //System.out.print(String.valueOf((char)(65)));
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        String[] nums=new String[x];
        for (int i=0; i<x; i++){
            nums[i]=scan.nextLine();
        }
        int[] Row=new int[x];
        int[] Col=new int[x];
        for (int i=0; i<x; i++){
            int blah = nums[i].indexOf("C");
            Row[i]=Integer.parseInt(nums[i].substring(1, blah));
            Col[i]=Integer.parseInt(nums[i].substring(blah+1));
        }
        for (int i=0; i<x; i++){
            if (Col[i]<1){
                System.out.print("");
            } else{
                int q=Col[i];
                //System.out.println("q is "+q);
                //Not Working
                if (q>11881376){
                    int a=q/11881376;
                    q=q%11881376;
                    System.out.print(String.valueOf((char)(a + 64)));
                }
                if (q>456976){
                    int a=q/456976;
                    q=q%456976;
                    System.out.print(String.valueOf((char)(a + 63)));
                }
                if (q>17576){
                    int a=q/17576;
                    q=q%17576;
                    System.out.print(String.valueOf((char)(a + 64)));
                }
                if (q>676){
                    int a=q/676;
                    q=q%676;
                    System.out.print(String.valueOf((char)(a + 64)));
                }
                if (q>26){
                    if (q%26==0){
                        int r= q/26-1;
                        if (r>0){
                            System.out.print(String.valueOf((char)(r + 64)));
                            q=26;
                        }
                    } else{
                        int r= (q-1)/26;
                        System.out.print(String.valueOf((char)(r + 64)));
                        q=q%26;
                    }
                }
                if (q>=0){
                    System.out.print(String.valueOf((char)(q + 64)));
                }
                //fix this
                //65 is a
                //row 1 is a row 26 is z, 27 is AA 28 AB AC AD AE AF AG AH AI AJ AK AL AM AN AO AP AQ AR AS AT AU AV AW AX AY AZ(52) BA(53)
                // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
            }
            if (Row[i]<1){
                System.out.println();
            } else{
                System.out.println(Row[i]);
            }
        }
    }
}