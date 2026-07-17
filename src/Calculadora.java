import java.util.Scanner;

public class Calculadora {

    static void soma(int n1, int n2) {
        System.out.println("O soma é: " + (n1 + n2));
        }
    static void subtracao(int n1,int n2){
        System.out.println("A subtração é: " + (n1 - n2));
        }
    static void multiplicacao(int n1,int n2){
        System.out.println("A multiplicação é: " + (n1 * n2));
        }
    static void divisao(int n1,int n2){
            if(n2 == 0){
                System.out.println("Não é possível por zero");
            }else{
                System.out.println("A divisão é " + (n1/n2));
            }
         }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = leia.nextInt();

        soma(n1,n2);
        divisao(n1,n2);
        multiplicacao(n1,n2);
        subtracao(n1,n2);

        }

}