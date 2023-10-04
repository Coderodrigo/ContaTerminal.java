import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main (String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


       double saldo = 237.48;

        System.out.println("Por favor, digite seu primeiro nome! ");
            String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome! ");
            String sobrenome = scanner.next();

        System.out.println("Por favor, digite sua agência! ");
            String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta! ");
            int numero = scanner.nextInt();





        
        System.out.println("Olá, " + nome + sobrenome + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");
        
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
