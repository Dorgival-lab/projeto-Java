/**

Em um array (vetor) de 10 posições armazenar valores calculados a partir do valor entrado de acordo com as seguintes regras: 
Nas posições do array múltiplas de 3 deverão ser armazenados valores de acordo com a seguinte fórmula (Índice da Posição x 30% x Valor Informado pelo Usuário)
No restante das posições a fórmula o armazenamento deverá ser feito pela seguinte fórmula (Índice da Posição x 10% x Valor informado pelo Usuário) 


*/

import java.lang.Math;

public class Standard {

    static int size = 20;
    static double width = 4.0;
    static double increments = width/size; 

    public static void main (String[] args) {

        double exponent, x, sqrtpart;

        double[] y = new double[size];

        x = - (width / 2);

        sqrtpart = Math.sqrt(2* Math.PI);

        int count = 0;
        while (count < size)
        {
            exponent = - ((x*x)/(2));

            y[count] = (Math.pow(Math.E,exponent))/sqrtpart;

            System.out.println(y[count]);

            x = x + increments;

            count++;
        }
    }
}