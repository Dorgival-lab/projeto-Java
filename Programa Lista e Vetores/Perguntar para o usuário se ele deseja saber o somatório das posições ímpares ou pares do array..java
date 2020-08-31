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