import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {

    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<String>();
        strings.add("One");
        strings.add("two");
        strings.add("three");

        strings.delete(1);
        System.out.println(strings.get(1));
    }

    private E[] values;

    SimpleArray(){
        values = (E[]) new Object[0];
    }
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp,0,values,0,temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return  false;
    }

    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp,0,values,0, index);
            int ElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp,index + 1, values, index, ElementsAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    public E get(int index) {
        return values[index];
    }

    public int size() {
        return values.length;
    }

    public void update(int index, E e) {
        values[index] = e;
    }

    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}
