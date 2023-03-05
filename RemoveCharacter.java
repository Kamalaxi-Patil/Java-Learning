public class RemoveCharacter 
{
   public static void main(String[] args) 
   {
        StringBuilder MyString = new StringBuilder("Hello World");
        System.out.println("The string before removing character: " + MyString);
        MyString = MyString.deleteCharAt(5);
        MyString = MyString.deleteCharAt(6);
        System.out.println("The string after removing character: " + MyString);
   }
} 