package task3;

public class OwnLinkedList<E> {
    private MyNode<E> headNode;
    private MyNode<E> tailNode;
    private int size;

    public OwnLinkedList() {
        headNode = null;
        tailNode = null;
    }

    public void addNodeAny(int index, E data) {
        checkRange(index);

        MyNode<E> currency = new MyNode<>(data, null, null);
        MyNode<E> newNode;

        if (index == 0) {
            addNodeToHead(data);
        } else if (index == size) {
            addNodeToTail(data);
        } else {
            newNode = getNodeByIndex(index);
            newNode.prev.next = currency;
            currency.prev = newNode.prev;
            newNode.prev = currency;
            currency.next = newNode;
            size++;
        }
    }

    public void addNodeToTail(E data) {
        MyNode<E> newNode = new MyNode<>(data, tailNode, null);

        if (tailNode == null) {
            MyNode<E> node = new MyNode<>(data, null, null);
            tailNode = headNode = node;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        size++;
    }

    private void addNodeToHead(E data) {
        MyNode<E> newNode = new MyNode<>(data, null, headNode);
        if (headNode == null) {
            MyNode<E> node = new MyNode<>(data, null, null);
            headNode = tailNode = node;
        } else {
            headNode.prev = newNode;
            headNode = newNode;
        }
        size++;
    }


    public void deleteNode(int index) {
        checkRange(index);

        if (index == 0) {
            deleteHeadNode();
        } else if (index == size-1) {
            deleteTailNode();
        } else {
            MyNode<E> currency;
            currency = getNodeByIndex(index);
            currency.prev.next = currency.next;
            currency.next.prev = currency.prev;
            size--;
        }
    }

    private void deleteHeadNode() {
        if (headNode.next == null) {
            tailNode = null;
        } else {
            headNode.next.prev = null;
            headNode = headNode.next;
        }
        size--;
    }

    private void deleteTailNode() {
        if (tailNode.prev == null) {
            headNode = null;
        } else {
            tailNode.prev.next = null;
            tailNode = tailNode.prev;
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public E get(int index){
        return getNodeByIndex(index).data;
    }

    private void checkRange(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bound");
    }

    private MyNode<E> getNodeByIndex(int index) {
        MyNode<E> node = headNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private static class MyNode<E> {
        private E data;
        private MyNode<E> prev;
        private MyNode<E> next;

        public MyNode(E data, MyNode<E> prev, MyNode<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
