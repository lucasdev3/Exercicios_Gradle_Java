
package Exercicios_Gradle_Java;

public class ExercicioLacosDeRepeticao {
    public static void main(String[] args) {
        System.out.println("NUMERO PARES DE 0 A 1000");
        
        for(int i=1; i <= 1000; i++) {
            if (i%2 == 0){
                System.out.println("i = "+i+" par");
            }
        }
    }
    
}
