
package Exercicios_Gradle_Java;

public class Arrays {
    
    public static void main(String[] args) {
        
        int[] idades = new int[4];
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 10;
        idades[3] = 5;
        
        String[] nomes = {"Lucas", "Joao", "Caio"};
        
        for(int i=0; i < idades.length; i++){
            
            System.out.println(idades[i]);
            
        }
        
        for (String aux : nomes){
            System.out.println(aux);
        }
    }
}
