
import java.util.Stack;
import java.util.Scanner;

public class TorreHanoi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack A = new Stack();
        Stack B = new Stack();
        Stack C = new Stack();

        System.out.print("Digite o número de Discos: ");

        int discos = input.nextInt();

        int numMinimo = (int) Math.pow(2, discos) - 1;

        if (numMinimo >= 2147483646) {

            System.out.println("O número ultrapassa o limite de carcteres de 'int', que é " + numMinimo);
            System.out.println("Logo é impoossível demonstrar os movimento necessários para completar a Torre");
            System.exit(0);
            
        } else {

            System.out.println("O número mínimo de movimentos é " + numMinimo);

        }

        System.out.println("mama sem morede");
        
    }

}
