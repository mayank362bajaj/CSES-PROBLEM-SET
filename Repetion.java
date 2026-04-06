import java.util.*;
public class Repetion {

    public static void main(String[] args) {
        String str = "ATTCCCCCCGGGA";
        System.out.println(reptite(str));
        
    }
    public static int reptite(String str){
       HashMap<Character, Integer>map =new HashMap<>();
       int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            
            if(max<e.getValue()){
                max=e.getValue();
                
            }
        }
            return max;
        }
    
    
}







