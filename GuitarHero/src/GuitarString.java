import java.util.Random;

public class GuitarString {

    public RingBuffer buffer;
    public static final int SAMPLING_RATE = 44100;
    public int num_tics;
    public GuitarString(double freq){
        int capacity = (int)Math.round(SAMPLING_RATE / freq);
        buffer = new RingBuffer(capacity);
        for(int i = 0; i < buffer.size(); i++){
            try{
                buffer.enqueue(0.0);
            }catch(Exception e){
                System.err.println("Error");
            }
        }
    }

    public GuitarString(double[] init){
        int capacity = init.length;
        buffer = new RingBuffer(capacity);
        for(int i = 0; i < capacity; i++){
            try{
                buffer.enqueue(init[i]);
            }catch(Exception e){
                System.err.println("Error");
            }
        }
    }

    public void pluck(){

        while(!buffer.isEmpty()){
            try {
                buffer.dequeue();
            }catch(Exception e){
                e.printStackTrace();
            }

            }
        while(!buffer.isFull()){
            Random rand = new Random();

            try {
                buffer.enqueue(rand.nextDouble()-0.5);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void tic(){
        double first = 0.0;
        double second = 0.0;
        double x;
        try {
            first = buffer.dequeue();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            second = sample();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            x = ((first + second)/2.0)*0.994;
            buffer.enqueue(x);

        }catch(Exception e){
            e.printStackTrace();
        }
        num_tics++;
    }

    public double sample(){
        return buffer.peek();
    }

    public int time(){
        return num_tics;
    }
}
