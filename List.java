import java.io.*;
import java.util.*;

public class List{


 public static void list() throws java.io.IOException {
  File temp = new File("list/list.txt"); //skaber 
  if (temp.exists()) {  //(if) hvis filen (list.txt) eksister skal den:
   Scanner file = new Scanner(temp);
   System.out.println("\nNuværende medlemmer i Delfinhallen.");
   while (file.hasNextLine()) {
    System.out.println(file.nextLine());

   }

  } else { //hvis filen (list.txt) ikke eksistere:
   System.out.println("Du har ikke en liste.\nListe oprettet!");
   Edit.add(); 
  }

 }
 }