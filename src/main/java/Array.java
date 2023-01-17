import java.util.Arrays;

public class Array {
    private int[] items;
    private int count; //represent the tota items of the array

    public Array(int length) {
        items = new int[length];
    }

        public void insert(int item){
                //If the array is full, resize it
                if (items.length == count){

                //create a new array (twice the size)
                int[] newItems = new int[ count * 2 ];

                //copy all the existensting items
                for (int i = 0; i < count; i++)
                newItems[i] = items[i];

                //set "items" to this new array
                items = newItems;

            }
        //Add the new item at the end
        items[count++] = item;
    }


        public void removeAt(int index){
        // validate the index
            if (index < 0 || index >= count)
                throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        for (int i = index; i < count; i++){
            items[i] = items[i +1];
        }
        count--; //decrement the total of item of the array
        }

    public void print (){
        for (int i = 0; i < count; i++){ //increment count every time that a new item are insert in this array
            System.out.println(items[i]);
        }
    }


    //de acordo com o incremento de itens nosso array cresce, assim como dininui conform removemos


}
