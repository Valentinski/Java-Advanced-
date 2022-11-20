package WorkshopCustomLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    //•	void addFirst(int element) – adds an element at the beginning of the collection
    public void addFirst (int number){
        //1. Create node
        Node newNode = new Node(number);
        // we check if the structure is empty
        if(!isEmpty()){
            newNode.next = head;
            head.prev = newNode;
        }else {
            tail = newNode;
        }
        //2. Head = new node
        head = newNode;
        //3.Size++
        size++;
    }

    private boolean isEmpty(){
        return this.size==0;
    }

    //•	void addLast(int element) – adds an element at the end of the collection
    public void addLast(int number){
        if(isEmpty()){
            addFirst(number);
            return;
        }
        Node newNode = new Node(number);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    //•	int get(int index) - Returns the element at the specified position in this list
    public int get(int searchIndex){
        checkIndex(searchIndex);
        int currentIndex = 0;
        Node currentNode ;
        if(searchIndex > size /2){
            currentNode = tail;
            int lastIndex = size - 1;
            int countOfItecrations = lastIndex - searchIndex;
            for (int i = 0; i <countOfItecrations ; i++) {
                currentNode = currentNode.prev;
            }
            //search from tail
        }else {
            //search from head
            currentNode = head;

            while (currentIndex < searchIndex){
                currentNode = currentNode.next;
                currentIndex++;
            }

        }

        return currentNode.value;
    }
    public void checkIndex (int index){
        if(index <0 || index >= size){
            throw new IndexOutOfBoundsException("No such index in the list");
        }
    }
    //•	int removeFirst() – removes the element at the beginning of the collection
    public int removeFirst(){
        if(isEmpty()){
            throw  new IllegalStateException("Can't remove from empty list!");
        }
        int result = head.value;
        size--;
        head = head.next;
        if(this.size > 1){
            head.prev = null;
        }
        if(isEmpty()){
            head = null;
            tail = null;
        }
        return 0;
    }

    //•	int removeLast() – removes the element at the end of the collection
    public int removeLast(){
        if(size < 2){
            return removeFirst();
        }
        int result = tail.value;
        tail = tail.prev;
        this.size--;
        return result;
    }

    //•	void forEach() – goes through the collection and executes a given action
    public void forEach (Consumer<Integer> consumer){
        Node currentNode = head;
        while (currentNode != null){
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    //•	int[] toArray() – returns the collection as an array

    public int[] toArray(){
        List<Integer> result = new ArrayList<>();
        forEach(result::add);
        return result.stream().mapToInt(e -> e).toArray();
    }
}
