
package Exercicios_Gradle_Java;

/**
 *
 * @author lucas
 */
public class ControleDeFluxo {
    public static void main(String[] args) {
        double salario = 1500d;
        double imposto;
        
        
        if (salario < 1000){
            imposto = (salario * 5 / 100);
            System.out.println("5% de imposto");
            System.out.println("Imposto: R$"+ imposto);
        }
        else if (salario >= 1000 && salario < 2000){
            imposto = (salario * 10 / 100);
            System.out.println("10% de imposto");
            System.out.println("Salario com reajuste: R$"+ imposto);
        }
        else if (salario >= 2000 && salario < 4000){
            imposto = (salario * 15 / 100);
            System.out.println("15% de imposto");
            System.out.println("Salario com reajuste: R$"+ imposto);
        }
        else{
            imposto = (salario * 20 / 100);
            System.out.println("20% de imposto");
            System.out.println("Salario com reajuste: R$"+ imposto);
        }
}

}