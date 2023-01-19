public class LinkedList<T> {
    private Node<T> begin;
    private Node<T> last;
    private int size = 0;


    public int getsize(){
        return this.size;
    }
    public void add(T elmenent){
        Node<T> cell = new Node<T>(elmenent);
        if (this.size == 0){
            this.begin = cell;
        } else {
            this.last.setNext(cell);
        }
        this.last = cell;
        this.size++;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "begin=" + begin +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
