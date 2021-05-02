package Exercicios_Gradle_Java;

public class ExercicioLacosDeRepeticao2 {

    public static void main(String[] args) {
        /*
        Dado um valor de um carro descubra em quantas parcelas podem ser divididos
        o valor, sendo que no minimo as parcelas devem ser de 1000 reais.
         */
        double valorTotal = 30000d;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcelas: " + parcela + " Valor: R$" + valorParcela);

            } else {
                break;
            }
        }

    }

}
