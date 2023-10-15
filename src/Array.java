import java.util.Arrays;

public class Array<T> {
    private Object[] objects = new Object[10];
    private int size;

    public void add(T t){
        if(size >= objects.length){
            Object[] temp = new Object[objects.length * 2];
            System.arraycopy(objects, 0, temp, 0, objects.length);
            objects = temp;
        }
        objects[size++] = t;
    }


    boolean compareArrays(Array<?> array1, Array<?> array2){
        return array1.size == array2.size;
    }

    @Override
    public String toString() {
        return "Array{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
