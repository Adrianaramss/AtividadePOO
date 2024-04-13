import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int valor_contador;
        System.out.println("digite o valor para o contador");
        valor_contador = leitura.nextByte();
        Contador  c = new Contador(valor_contador);
        System.out.println("O valor do contador "  + c.getContador());
        c.incremento();
        c.incremento();
        System.out.println("O valor do contador "  + c.getContador());
        c.zerar();
        System.out.println("O valor do contador "  + c.getContador());


    }
    }
