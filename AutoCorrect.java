
/**
 * Write a description of class AutoCorrect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class AutoCorrect
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.nextLine();
        for (int i=0; i<x; i++){
            int d=scan.nextInt();
            //scan.nextLine();
            int w=scan.nextInt();
            scan.nextLine();
            String[] words=new String[d];
            //String[] tests=new String[w];
            for(int j=0; j<d; j++){
                words[j]=scan.nextLine();
            }
            for(int j=0; j<w; j++){
                String s=scan.nextLine();
                int[] score=new int[d];
                for (int o=0; o<d; o++){ //through every word
                    if (words[o].length()==s.length()){
                        //code to find the score
                        int tempScore=0;
                        for (int letter=0; letter<words[o].length(); letter++){
                            //tempScore+=distanceBetween(words[o].charAt(letter),s.charAt(letter));
                            if (words[o].charAt(letter)==(s.charAt(letter))){
                                
                            } else{
                                tempScore++;
                            }
                        }
                        score[o]=tempScore;
                        
                    } else{
                        score[o]=words[o].length()*2;
                    }
                }
                int minAt=0;
                for (int find=0; find<score.length; find++){
                    if (score[find]<score[minAt]&&score[find]!=-1){
                        minAt=find;
                    }
                }
                System.out.println(words[minAt]);
                
                
            }
        }
    }
    public static int distanceBetween(char first, char second){
        int fx=(int)first;
        int sx=(int)second;
        return Math.abs(first-second);
    }
}
