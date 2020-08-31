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