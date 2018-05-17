import java.util.*;

public class Login {

 public static void Menu() throws java.io.IOException {

   String Username;
   String Password;

   Password = "1";
   Username = "1";

   Scanner input1 = new Scanner(System.in);
   System.out.println("Indtast brugernavn : ");
   String username = input1.next();

   Scanner input2 = new Scanner(System.in);
   System.out.println("Indtast Password : ");
   String password = input2.next();

   if (username.equals(Username) && password.equals(Password)) { //hvis burger navn og kode er gyldige

    System.out.println("Gå glad i bad! Velkommen! " + Username);
    Menu.main(); //føre hen til mainMenu(); metoden

   } else if (username.equals(Username)) { //(else if) ellers hvis kun brugernavn er gyldig
    System.out.println("Forkert Password!"); // ugyldig kode!
    System.out.println("");
    System.out.println("Prøv igen.");
    Login.Menu(); //føre tilbage til login();

   } else if (password.equals(Password)) { //(else if) ellers hvis kun adgangskode er gyldig
    System.out.println("Forkert brugernavn!"); // ugyldig brugernavn!
    System.out.println("");
    System.out.println("Prøv igen");
    Login.Menu(); //føre tilbage til login();

   } else { //(else) både brugernavn og kode er ugyldige
    System.out.println("Forkert brugernavn & Password!"); //ugyldig brugernavn og kode!
    System.out.println("");
    System.out.println("Prøv igen");
    Login.Menu(); //føre tilbage til login();
   }

  } // lukker for login(); metode
  }