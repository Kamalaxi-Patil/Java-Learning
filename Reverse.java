public class Reverse{
    public static void main(String args[]){
        String Str = "Appa", reverseStr = "";
        int Strlength = Str.length();
        
        for(int  i = (Strlength-1);i>=0; --i){
            reverseStr = reverseStr + Str.charAt(i);
        }
        System.out.println("Reversed String:" + reverseStr);
        System.out.println("String length:" + Strlength);
    }
}