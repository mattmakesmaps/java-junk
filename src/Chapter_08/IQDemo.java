package Chapter_08;

/**
 * Created by matt on 8/25/15.
 */

class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int length){
        // Create the queue
        q = new char[length];
        putloc = 0;
        getloc = 0;
    }

    public void put(char ch) {
        // Place something in the queue
        q[putloc] = ch;
        // update get location and put location.
        putloc += 1;
    }

    public char get(){
        // Get something from the queue
        char out_val = q[getloc];
        getloc += 1;
        return out_val;
    }
}

class IQDemo {
    public static void main(String args[]) {
        FixedQueue fq1 = new FixedQueue(5);
        for (int i=0; i<5; i++) {
            fq1.put((char) i);
        }

        for (int i=0; i<5; i++) {
            System.out.println(fq1.get());
        }
    }
}
