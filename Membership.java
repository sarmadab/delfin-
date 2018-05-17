import java.util.*;
public class Membership{

   public static void membership() throws java.io.IOException {
      Scanner input = new Scanner(System.in);
      Member [] members = new Member[4];
      String temp; 
      
      for (int i = 0; i < members.length; i++){
      System.out.println("Enter your membership name please: ");
      temp = input.next(); 
      members[i] = new Member();
      members[i].setMember(temp);
}
      for (int i = 0; i < members.length; i++){
         System.out.println("Member: " + members[i].getMember());
             
}
}
} 

