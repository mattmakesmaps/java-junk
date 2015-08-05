package Chapter_05;

/**
 * Created by matt on 7/30/15.
 */
class Queue {
    char q[];
    int putloc, getloc;

    Queue (int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        /**
         * Equivalent to this:
         * q[putloc] = ch;
         * putloc++;
        **/
        q[putloc++] = ch;
    }

    char get() {
        // rather then check the length of the queue,
        // check against the number of items put into it.
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
        }

        return q[getloc++];
    }
}

class queue_implementation {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet");

        for (i=0; i<26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.print("Contents of bigQ: ");
        for(i=0; i<26; i++) {
            ch = bigQ.get();
            // (char) 0 is the default value populated inside
            // a newly initialized char array.
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
    }
}
