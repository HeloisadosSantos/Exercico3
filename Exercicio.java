import java.util.Scanner;

/**
 * Exercicio
 */
public class Exercicio {

    Scanner sc = new Scanner(System.in);

     public void Exercicio4(){
     System.out.println("Coloque a Quantidade de Maçã");
     double Maca= sc.nextDouble();
     if (Maca>12) {
        System.out.println("Você pagará" + Maca *0.25);
     }else{
        System.out.println("Você pagará" + Maca *0.30);
     }
     }


     public void Exercicio6(){
        System.out.println("Digite um número");
        int N = sc.nextInt();
        if (N>1+2) {
            System.out.println("Esse é um número Impar" +(N*3) );
        }else{
            System.out.println("Número Par");
        }
     }
    }
