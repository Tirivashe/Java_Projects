public class RingBuffer {

    public double []buffer;
    public int size;
    public int first;  // the first element in the list
    public int last;   // the last location where we put an item

    public RingBuffer(int capacity){
        buffer = new double[capacity];
        size = 0;
        first = 0;
        last = 0;
    }

    // Return the number of items in buffer
    public int size(){
        return Math.abs(last-first);
    }

    //Check if the buffer is empty
    public boolean isEmpty(){
        return size == 0;
    }

    //check if buffer is full
    public boolean isFull(){
        return size == buffer.length;
    }

    //add item to the buffer
    public void enqueue(double x)throws Exception{
        if(this.isFull()){
            throw new Exception("Buffer is full");
        }
        buffer[last] = x;
        last = (last + 1) % buffer.length;
        size++;
    }

    //delete and return from the front
    public double dequeue()throws Exception{
        if(!this.isEmpty()){
            double item = buffer[first];
            first = (first + 1) % buffer.length;
            size--;
            return item;
        }
        else{
            //System.err.println("Cannot remove any item. The buffer is empty");
            throw new Exception("Cannot remove any item. The buffer is empty");
        }
    }

    public double peek(){
        return buffer[first];
    }

}
