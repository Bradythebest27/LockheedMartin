
/**
 * Write a description of class sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sort
{
    public static void sorter(String[] arr){
        for (int pass= arr.length-1; pass>=1; pass--){
            String large=arr[0];
            int index=0;
            for (int k=0; k<=pass; k++){
                if ((arr[k].compareTo(large))>0){
                    large=arr[k];
                    index=k;
                    
                }
                
            }
            arr[index]=arr[pass];
            arr[pass]=large;
            System.out.println("\n"+pass+"\n");
            for (int i=0; i<8; i++){
                System.out.print(arr[i]+"\t");
            }
        }
    }
    public static void main(String[] args){
        String[] arrs={"Ann","Mike","Walt","Lisa","Shari","Jose","Mary","Bill"};
        sorter(arrs);
    }
}
