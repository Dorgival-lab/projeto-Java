/**

Ler do usuário um valor múltiplo de 10 entre 100 e 1000

*/


public static void main(String args[]) {
    int count = 0;
    int input = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Insira numeros: ");
    input = sc.nextInt();

    while (input < 100 || input > 1000) {
        System.out.println("Digite um número entre 100 e 1000");
        input = sc.nextInt();
        count++;
    }
    System.out.println(input + " fits " + count(input) + " times");
}


private static int count(int input) {
    int result = 0;
    int temp = input;
    while (temp <= 1000) {
        if (temp >= 500) {
            result++;
        }
        temp += input;
    }
    return result;
}

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

/**

Perguntar para o usuário se ele deseja saber o somatório das posições ímpares ou pares do array. 

*/

import java.io.*; 
  
class EvenOddSum { 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6 }; 
        int even = 0, odd = 0; 
  
        // Loop para encontrar soma ímpar par 
        for (int i = 0; i < arr.length; i++) { 
            if (i % 2 == 0) 
                even += arr[i]; 
            else
                odd += arr[i]; 
        } 
  
        System.out.println("Mesmo soma de posições de índice: " + even); 
        System.out.println("Soma das posições ímpares do índice: " + odd); 
    } 
} 

/**

Dependendo da escolha do usuário realizar a soma dos valores das posições ímpares ou pares do array.  

*/

import java.util.Scanner;
public class Sum_Odd_Even 
{
    public static void main(String[] args) 
    {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o número de elementos na matriz:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Insira os elementos da matriz:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Soma de números pares:"+sumE);
        System.out.println("Soma de números ímpares:"+sumO);
    }
}

/**

Mostrar para o usuário o resultado da soma.  

*/

import java.util.*;

public class AddingMachine {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean justStarting = true;
    int total = 0;
    int subtotal = 0;
    int input;
    int last = 1;
    int MAXIMUM_NUMBER_OF_INPUTS = 100;
    while (true) {
        input = scanner.nextInt();
        if (input == 0) {
            if (last == 0) {
                System.out.println("total " + total);
                return;
            }
            System.out.println("subtotal " + subtotal);
            total += subtotal;
            subtotal = 0;
        }
        subtotal += input;
        last = input;
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = last;
        }
        System.out.println(Arrays.toString(numbers));
    }
}