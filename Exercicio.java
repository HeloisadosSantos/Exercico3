import java.lang.invoke.StringConcatFactory;
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
        if (N%2==0) {
            System.out.println("Esse é um número Par" );
        }else{
            System.out.println("Número Impar");
        }
     }

     public void Exercicio7(){
      System.out.println("Digite sua Nota");
      int Nota = sc.nextInt();
      
      if (Nota>=7){
         System.out.println("Aprovado");
      }
      else if (Nota==6) {
         System.out.println("Você esta de Recuperação");
      }
      else if (Nota<=5){
         System.out.println("Reprovado");
      }
     }

    public void Exercicio3() {
      System.out.println("Digite uma letra");
      String Letra = sc.nextLine();
      String tipoLetra = "";
      switch (Letra){
         case "a": tipoLetra = "vogal";
         break;
         case "e": tipoLetra = "vogal";
         break;
         case "i": tipoLetra = "vogal";
         break;
         case "o": tipoLetra = "vogal";
         break;
         case "u": tipoLetra = "vogal";
         break;
         default: tipoLetra = "Consoante";
         break;
    }
      System.out.println( Letra+ "é um" + tipoLetra);
   }

   public void Exercicio5(){
      System.out.println("Qual tipo de cliente você se enquadra ? (Vip,Comum,Funcionario)");
      String Cliente = sc.nextLine();
      String Desconto = "";
      switch (Cliente) {
         case "Vip": Desconto = "-0.5%";
            break;
         case "Funcionario": Desconto = "1";   
            break;
         default: Cliente = "0";
            break;
      }
      System.out.println( Cliente+"o valor é:"+Desconto);
   }
}

    
