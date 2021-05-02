
package Exercicios_Gradle_Java;

/**
 *
 * @author lucas
 */
public class ControleDeFluxo {
    public static void main(String[] args) {
        int idade = 16;
     
        
        if (idade < 15){
            System.out.println("Categoria Infantil");
        }
        else if (idade >= 15 && idade <= 18){
            System.out.println("Categoria Juvenil");
        }
        
        else{
            System.out.println("Categoria Adulto");
        }
}

}