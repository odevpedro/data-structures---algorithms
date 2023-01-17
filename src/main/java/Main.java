import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //one way to declare the array
        int[] numbers = new int [3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers));

        //another way
        int[] sequence = {10, 20, 30};
        System.out.println(sequence.length); //we cannot change de size of this array
        System.out.println(Arrays.toString(sequence));

        //and another
        Array number = new Array(3);
        number.insert(10);
        number.insert(20);
        number.insert(40);
        number.insert(70);
        number.insert(92);

        number.removeAt(40);
        number.print();





        // São estaticos, possuem um tamanho fixo
        //Array é a estrutura de dados mais simples, usada para alocar uma lista de itens de forma sequêncial.
        //A complexidade da busca de um array é O(1)
        // arrays são estaticos, criados com um tamanho que não pode ser modificado


        //A restruturação de um array é proporcional ao tamanho do outro

        /*Quando apagamos um item de um array todos os outros itens são rearanjados de modo a cobrir
        * o espaço que era ocupado pelo anterior*/
    }
}
