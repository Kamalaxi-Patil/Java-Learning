public class StringMethods{
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Program to apply all String Methods");
        System.out.println("The strings are "+str1+"and"+str2);

        int len1=str1.length(); 
        int len2=str2.length();
        System.out.println("The length of "+str1+" is :"+len1);
        System.out.println("The length of "+str2+" is :"+len2);
        System.out.println("The Concatination of two strings:"+str1.concat(str2));
        System.out.println("The LowerCase of str1:"+str1.toLowerCase());
        System.out.println("The UpperCase of str1:"+str2.toUpperCase());
        boolean check = str1.equals(str2); 
        if(check==false){
        System.out.println(""+str1+" and "+str2+" are not same");
        }
         else{
        System.out.println("" + str1+" and " + str2+"are same");
         }
    }
}