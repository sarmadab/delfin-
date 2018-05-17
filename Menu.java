import java.util.*;
import java.io.*;

public class Menu{

public static void main() throws java.io.IOException {
  Scanner scan = new Scanner(System.in);
  int input = 0;
  int check;
  System.out.println("\nHej! Hvad kan vi hjælpe med?");
  System.out.println("\n1.Liste over medlemmer.\n2.Nyt medlem.\n3.Slet medlem.\n4.Info om medlem.\n5.Afslut.");

  while (input != 5) {;
   int input1 = scan.nextInt();
   check = input1;
   switch (check) {
    case 1:
     List.list();
     Menu.main();
     break;
    case 2:
     System.out.println("Indsæt venligst information om det nye medlem.\n");
     Edit.add();
     break;
    case 3:
     List.list();
     Edit.delete();
     break;
    case 4:
     //System.out.println("Se info på medlem: ");
     List.list();
     Edit.info();
     break;
    case 5:
     System.exit(0);
     break;  
   default:
     System.out.println("Det er ikke muligt prøv et tal mellem 1-5 tak");
     Menu.main();
   }
  }
 }

 public static void start() throws java.io.IOException {

  char choice;
  //do {
   System.out.println("Velkommen til Delfin svømmehals nye super interaktive system! Man fristes næsten til at sige whalecum.");
   System.out.println(" 1. Login");
   System.out.println(" 2. Exit");
   choice = (char) System.in.read();
  /*}*/ while (choice < '1' || choice > '2'){
   System.out.println("fejl i indtastning, vælg mellem 1 og 2");
   choice = (char) System.in.read();
   }
  System.out.println("\n");
  switch (choice) {
   case '1':
    Login.Menu();
    break;
   case '2':
    System.out.println("Ha en god dag :)");
    System.exit(0);
    break;
  }

 }


}