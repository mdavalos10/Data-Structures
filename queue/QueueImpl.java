package queue;

public class QueueImpl implements Queue {

    private int LENGTH = 7;
    private String[] arr = new String[LENGTH];
    private int size = 0;


    @Override
    public boolean isFull() {
        if (arr[LENGTH - 1] != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(size > 0)
            return false;
        else
            return true;
    }

    @Override
    public String deQueue() {
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }
        String dequeueValue = arr[size-1];
        arr[size-1] = null;
        size = size - 1;

        System.out.println(dequeueValue + " has been removed from list");
        return dequeueValue;
    }


    @Override
    public void enQueue(String element) {
        if(isFull()) {
            System.out.println("sorry, full queue");
        }else {
            if (isEmpty()) {
                arr[0] = element;
                size++;
            }
            else {
                //shift all elements 1 towards the end
                //everybody shift one to the right..
                for (int i = size; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                //add to the 0th position
                arr[0] = element;
                size++;
            }
        }

    }

    @Override
    public void display() {
        for (int i = size-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public String peek() {
        String f;
        f = arr[size-1];
        return f;
    }
}
