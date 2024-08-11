import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class leetcode {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       if(s.length()==0)
            System.out.println(0);
        

        Map<Character,Integer> sf=new HashMap<>();
       

    
       
       sf.put('I',1);
       sf.put('V',5);
       sf.put('X',10);
       sf.put('L', 50);
       sf.put('C', 100);
       sf.put('D', 500);
       sf.put('M', 1000);
       int result=0;
       result=sf.get(s.charAt(s.length()-1));
       
       for(int i=s.length()-2;i>=0;i--){
           if(sf.get(s.charAt(i))<sf.get(s.charAt(i+1))){
               result-=sf.get(s.charAt(i));
           }else{
                result+=sf.get(s.charAt(i));
           }
       }
       System.out.println(result);

        

            }
        
    }
