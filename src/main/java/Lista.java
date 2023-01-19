public class Lista<T> {
    private Node<T> begin;

    public void adiciona(T elmenent){
       Node<T> cell = new Node<T>(elmenent);
        this.begin = cell;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "begin=" + begin +
                '}';
    }
}
