public class IntegerSet {
    private int size;


    private byte[] array;


    private int length;



    public IntegerSet() {
        this.size = size;
        length = (size >> 3) + 1;
        array = new byte[length];
    }



    public boolean get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i = index >> 3;
        int mod = index & ((1 << 3) -1); // resto
        return (array[i] & (1 << mod)) != 0;
    }


    public void set(int index, boolean valor) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        int i = index >> 3;
        int mod = index & ((1 << 3) -1);

        if (valor) {
            array[i] = (byte) (1 << mod | array[i]);
        } else {
            array[i] = (byte) (~(1 << mod) & array[i]);
        }
    }

    public int size() {
        return size;
    }

}
