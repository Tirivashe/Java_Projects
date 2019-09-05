import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer> myArray = new ArrayList<Integer>();

    public IntegerSet(){
        IntegerSet set1 = new IntegerSet();

    }


    public boolean empty() {
        return myArray.isEmpty();
    }

    public void insert(int i) {
        if(!myArray.contains(i)){
            myArray.add(i);
        }
    }

    public void remove(int i) {
        myArray.remove(new Integer(i));
    }

    public int size() {
        return myArray.size();

    }

    public boolean contains(int i) {
        return myArray.contains(i);
    }


}

