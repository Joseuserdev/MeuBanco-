
import java.util.Locale;//importing java locale
import java.util.Scanner;//importing java scanner

/*bellow we´ve created a class about main
 method where the project will be builded */
public class ContaTerminal { 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);


        System.out.println("olá bem vindoa nossa central de cadastro");

        System.out.println("para começarmos gostariamos de saber seu nome:");


        try { /*here weve inserted a time between the questions & answers */
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         String nomeUsuario=  scanner.next(); //input from scanner 
         System.out.println("muito obrigado pelas informações!"+nomeUsuario);

        try { /*here we´ve inserted a time between the questions & answers */
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         System.out.println(" por gentileza ! insira sua agencia: ");

         try { /* here we´ve inseted a time between the questions & answers */
             Thread.sleep(1000);
         } catch ( InterruptedException e) {
            e.printStackTrace();
         }

         String agencia= scanner.next(); //input from scanner
           
         System.out.println("insira o numero da sua conta :");

         try { /* here we´ve inserted  time between the questions & answers */
             Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }

           int conta= scanner.nextInt(); //input from scanner

           System.out.println("e por ultimo seu saldo disponivel:");

           try { /* here we´ve inserted  time between the questions & answers */
               Thread.sleep(1000);
           } catch (InterruptedException e) {
            e.printStackTrace();
           }
           Double saldo= scanner.nextDouble(); //input from scanner 

System.out.println("então..."+nomeUsuario+"!");
System.out.println("sua agencia é a :"+agencia);
System.out.println("a conta é de numero"+conta);
System.out.println("por ultimo, seu saldo e de R$:"+saldo);

    }
}
