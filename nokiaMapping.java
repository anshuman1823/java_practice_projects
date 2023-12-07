import java.util.*;

class nokiaMapping{
    public static String map[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void nokiaMap(int idx, String inStr, String finStr){
        if(idx == inStr.length()){
            System.out.println(finStr);
            return;
        }
        String mapStr = map[inStr.charAt(idx) - '0'];
        for(int i = 0; i < mapStr.length(); i++){
            nokiaMap(idx+1, inStr, finStr + mapStr.charAt(i));
        }
    }

    public static void main(String args[]){
        nokiaMap(0, "123", "");
    }
}