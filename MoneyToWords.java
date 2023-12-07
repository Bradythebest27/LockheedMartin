
/**
 * Write a description of class MoneyToWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MoneyToWords
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        Double[] nums=new Double[x];
        Double[] orig=new Double[x];
        String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        for (int i=0; i<x; i++){
            nums[i]=scan.nextDouble();
            orig[i]=nums[i];
        }
        for (int i=0; i<x; i++){
            if (nums[i]>19){
                System.out.print(tens[(int)(nums[i]/10)]);
                nums[i]=nums[i]%10;
                
                
                if (nums[i]>=9){
                    System.out.print("-nine");
                }  else if (nums[i]>=8){
                    System.out.print("-eight");
                }  else if (nums[i]>=7){
                    System.out.print("-seven");
                }  else if (nums[i]>=6){
                    System.out.print("-six");
                }  else if (nums[i]>=5){
                    System.out.print("-five");
                }  else if (nums[i]>=4){
                    System.out.print("-four");
                }  else if (nums[i]>=3){
                    System.out.print("-three");
                }  else if (nums[i]>=2){
                    System.out.print("-two");
                }  else if (nums[i]>=1){
                    System.out.print("-one");
                }
                
            }  else if (nums[i]>=19){
                System.out.print("ninteen");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=18){
                System.out.print("eighteen");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=17){
                System.out.print("seventeen");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=16){
                System.out.print("sixteen");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=15){
                System.out.print("fifteen");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=14){
                System.out.print("fourteen");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=13){
                System.out.print("thirteen");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=12){
                System.out.print("twelve");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=11){
                System.out.print("eleven");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (nums[i]>=10){
                System.out.print("ten");
                double w=nums[i];
                nums[i]=nums[i]-((int)w);
            }  else if (orig[i]<1){
                System.out.print("zero");
            }
            if (orig[i]>1){
                double q=orig[i];
                int p=(int)(100*(orig[i]-(int)q));
                System.out.println(" and "+p+"/100 dollars");
            } else{
                double q=orig[i];
                int p=(int)(100*(orig[i]-(int)q));
                System.out.println(" and "+p+"/100 dollar");
            }
            
        }
    }
}
