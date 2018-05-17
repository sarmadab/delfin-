import java.util.*;
import java.io.*;

public class Edit {

public static void add() throws java.io.IOException {
  Scanner s = new Scanner(System.in);

  System.out.print("Navn: ");
  String filename = s.nextLine();

  PrintStream output = new PrintStream("list/" + filename + ".txt");
  PrintStream output1 = new PrintStream(
   new FileOutputStream("list/list.txt", true)); //gemmer filen uden at overwrite 

  output1.println(filename);

  System.out.print("Alder: ");

  String alder = s.nextLine();

  output.println("Navn: " + alder);

  System.out.print("Medlemmet status (aktiv/passiv): ");

  String medlemsstatus = s.nextLine();

  output.println("Medlems status: " + medlemsstatus);
 //

  System.out.print("Svømmetype(Junior, senior, motionist, pro): ");

  String type = s.nextLine();
  
   output.println("Type: " + type);
//
  System.out.print("Kontingentsats((under 18 = 1000), senior (over 17 = 1600), Ældre (over 60 = 1200), passiv = 500)): ");

  String sats = s.nextLine();
  
   output.println("Sats: " + sats);

  System.out.print("Restance? ");

  String restance = s.nextLine();
  
   output.println("Restance: " + restance);
  
  System.out.print("Konkurrence stats: ");

  String konkurrence = s.nextLine();
  
   output.println("Stats: " + konkurrence);
  

  System.out.println("\nOprettet\n");


  Menu.main(); 
 }

 public static void delete() throws java.io.IOException{
Scanner input3 = new Scanner(System.in);

  System.out.print("Hvilket medlem vil du slette? ");
  String deleteMovieName = input3.nextLine();

try
        {
                BufferedReader file = new BufferedReader(new FileReader("list/list.txt"));
                String line;
                String input = "";
                while ((line = file.readLine()) != null) 
                {
                    //System.out.println(line);
                    if (line.contains(deleteMovieName))
                    {
                        line = "";
                        System.out.println("Medlem slettet.");
                    }
                    input += line + '\n';
                    
                }
                FileOutputStream File = new FileOutputStream("list/list.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
        }
        catch (Exception e)
        {
                System.out.println("Fejl i fillæsning.");
        }

         Menu.main();
}

public static void info() throws java.io.IOException {
 Scanner op = new Scanner (System.in);
 String opName;
    System.out.println("\n Hvilket medlem vil du se info på?");
  opName = op.next();
  File temp = new File("list/" + opName +  ".txt"); //skaber 
  if (temp.exists()) {  //(if) hvis filen (list.txt) eksister skal den:
   Scanner file = new Scanner(temp);
   System.out.println("\nInfo er følgende: ");
   while (file.hasNextLine()) {
    System.out.println(file.nextLine());
   }

  } else { //hvis filen (list.txt) ikke eksistere:
   System.out.println("Ikke eksisterende navn, skal være registreret.");
   Edit.info();
  }
 
 Menu.main();
 
 }



}