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