import java.util.*;
public class Candies
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();scan.nextLine();
        ArrayList[] nums=new ArrayList[x];
        int w=0;
        for(int i=0; i<nums.length; i++){
            nums[i]=new ArrayList<Integer>();
        }
        while (scan.hasNext()){
            String s=scan.nextLine();
            if (!s.equals(""))
                nums[w].add(s);
            else{
                w++;
            }
        }
        for (int i=0; i<x; i++){
            int total=0;
            for(int j=0; j<nums[i].size(); j++){
                total+=Integer.parseInt(""+nums[i].get(j));
            }
            if (total%nums[i].size()==0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}