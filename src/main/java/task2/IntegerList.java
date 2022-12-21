package task2;

public class IntegerList implements OwnList {
    private Integer[] list;
    private int size;

    public IntegerList(int capacity) {
        list = new Integer[capacity];
    }

    public IntegerList() {
        list = new Integer[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Integer element) {
        list[size] = element;
        size++;
        if (size == list.length) {
            Integer[] list1 = new Integer[list.length * 2];

            for (int i = 0; i < list.length; i++) {
                list1[i] = list[i];
            }
            list = list1;
        }
    }

    @Override
    public Integer get(int i) {
        return list[i];
    }

    @Override
    public void add(int index, Integer element) {
        checkRange(index);

        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = element;
        size++;
    }

    @Override
    public Integer remove(int index) {
        checkRange(index);

        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return index;
    }

    private void checkRange(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bound");
        }
    }
}