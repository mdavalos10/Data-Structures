package stack; 

public class StackImpl implements Stack {
    private int LENGTH = 10;
    String[] arr = new String[LENGTH];
    int index = 0;
    private int top;
    private int size;

    @Override
    public void push(String s) {
        if (isFull()) {
            System.out.println("Sorry, no room left..");
            return;
        }
        //move each element in array to pos + 1
        for (int i = index; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        //after all moved, add new element to 0th
        arr[0] = s;
        index++;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("Line is Empty");
        }
        String popValue = arr[0];
        arr[0] = null;

        for(int i = 0; i < size-1; i++){
            arr[i] = arr[i+1];
        }
        return popValue;

    }

    @Override
    public Boolean isEmpty() {
       return false;

    }

    @Override
    public Boolean isFull() {
     return false;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public String peek() {
        String f;
        f = arr[0];
        return f;
    }


    @Override
    public void display() {
        for (int i = index - 1; i >= 0; i--) {
            if (arr[i] == null) {
                continue;
            } else {
                System.out.println(arr[i]);
            }

        }
    }

    @Override
    public void setCapacity(int size) {
            arr = new String[size];
            top = -1;
            this.size = size;
        }

        @Override
    public void popAll(){
        for (int i = 0; i< arr.length; ++i){
            arr[i] = null;
        }
            System.out.println("Line is empty");
        }

}
