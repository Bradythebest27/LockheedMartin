
/**
 * Write a description of class OurGlass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OurGlass
{
    public static void main(String[] args){
        String s=new String("");
        System.out.println(s);
        int odd;
        for (int i=1; i<(s.length()+1)/2;i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print(s.substring(i,i+1));
            for(int k=0; k<(s.length()-i-2)-i; k++){
                System.out.print(" ");
            }
            if (i!=s.length()-i-1)
                System.out.println(s.substring(s.length()-i-1,s.length()-i));
            else{
                System.out.println();
            }
        }
        for (int i=1; i<(s.length()+1)/2;i++){
            if (!(s.length()%2==1&&i==1)){
                for (int j=(s.length()+1)/2-i; j>0;j--){
                    System.out.print(" ");
                }
                System.out.print(s.substring((s.length()+1)/2-i,(s.length()+1)/2-i+1));
                odd=0;
                if (s.length()%2==1){
                    odd=1;
                }
                for(int k=0; k<2*(i-1)-odd; k++){
                    System.out.print(" ");
                }
                System.out.println(s.substring(s.length()/2+i-1,s.length()/2+i));
            }
        }
        if (s.length()>1){
            System.out.println(s);
        }
    }
}
