package WorkshopCustomDataStructures;

import java.util.function.Consumer;

// we create our own method SmartArray
public class SmartArray {

    private int [] data;
    private int size;

    private int[] grow() {
            //with data.length*2 we increase the speed of calculations
    int newLength = data.length * 2;

    int [] newData = new int[newLength];

            //copy one array into another
    System.arraycopy(data, 0, newData, 0, data.length);

     return newData;
     }

    private int[] shrink() {
        int newLength = data.length / 2;

        int [] newData = new int [newLength];

        System.arraycopy(data, 0, newData,0, size);

        return newData;
    }

     private void ensureIndex(int index){
         if(index < 0 || index >= size){
             throw new IndexOutOfBoundsException("Index "+ index + " out of bounds for size " + size );
         }
     }

    public SmartArray(){
        // initialisation "data"
        // how many elements can we save int[4]
        this.size=0;
        this.data= new int[16];
    }

    //•	void add(int element) - Adds the given element to the end of the list
    public void add (int element){
        if(size == data.length){
            data = grow();
        }

        data[size++] = element;
    }


    //•	int get(int index) - Returns the element at the specified position in this list
    public int get (int index){
        ensureIndex(index);
       return data[index];
        }

    // new "size" method is created
    public int size () {
       return size;
        }


    //•	int remove(int index) - Removes the element at the given index
    public int remove (int index){
        int removedElement = get(index);

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = 0;
        size--;

        if(size == data.length/2){
            data = shrink();
        }

        return removedElement;
    }




    //•	bool contains(int element) - Checks if the list contains the given element returns (True or False)
    public boolean contains (int element){

        for (int i = 0; i < size; i++) {
            int next = data[i];
            if(element == next){
                return true;
            }
        }
        return true;
    }

    //•	void add(int firstIndex, int secondIndex) - Adds element at the specific index, the element at this index gets shifted to the right alongside any following elements, increasing the size

    public void  add(int index, int element){

        int lastElement = data[size - 1];

        for (int i = size - 1 ; i > index ; i--) {
            data [i] = data[i - 1];
        }

        data[index] = element;

        add(lastElement);
    }

    //•void forEach(Consumer<Integer> consumer) - Goes through each one of the elements in the list

    public void forEach (Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
            consumer.accept(data[i]);
        }
    }
}
