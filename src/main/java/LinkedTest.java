public class LinkedTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        System.out.println("O tamanho é: " + list.getsize());
        System.out.println(list);

        list.add(2);
        System.out.println(list);
    }
}
