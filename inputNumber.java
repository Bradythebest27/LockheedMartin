
/**
 * Write a description of class missingSensor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */import java.util.*;
import java.util.*;

public class InputNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ArrayList<Integer>[] cool = new ArrayList[x];
        
        for (int i = 0; i < x; i++) {
            cool[i] = new ArrayList<Integer>();
            int w = scan.nextInt();
            for (int j = 0; j < w - 1; j++) {
                cool[i].add(scan.nextInt());
            }
        }

        for (int i = 0; i < cool.length; i++) {
            Collections.sort(cool[i]);
            
            boolean truth=true;
            for (int j = 0; j < cool[i].size(); j++) {
                if (cool[i].get(j)!=j+1&&truth) {
                    System.out.println(j+1);
                    truth=false;
                }
            }
        }
    }
}
