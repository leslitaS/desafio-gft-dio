import java.util.*;
import java.util.stream.Collectors;
/*
Desafio
        Crie um programa onde você receberá valores inteiros não negativos como entrada.

        Ordene estes valores de acordo com o seguinte critério:

        Primeiro os Pares
        Depois os Ímpares
        Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

        Entrada
        A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

        Saída
        Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.


*/
public class parImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer numeros;
        Integer n;
        List<Integer> parImpar = new ArrayList<>();
        n = scan.nextInt();
        for (int i=0; i < n; i++){
            numeros = scan.nextInt();
            parImpar.add(numeros);
        }
        List<Integer> paresOrdem= parImpar.stream()
                .filter(i -> (i%2 ==0))
                .sorted().collect(Collectors.toList());
        List<Integer> imparOrdem = parImpar.stream()
                .filter(i -> (i%2 !=0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> listaNumeros = new ArrayList();
        listaNumeros.addAll(paresOrdem);
        listaNumeros.addAll(imparOrdem);
        listaNumeros.forEach(System.out::println);
    }
}
