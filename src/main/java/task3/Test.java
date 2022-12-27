package task3;

public class Test {
    public static void main(String[] args) {
        OwnLinkedList<String> ownLinkedList = new OwnLinkedList<>();
        ownLinkedList.addNodeToTail("1");
        ownLinkedList.addNodeToTail("2");
        ownLinkedList.addNodeToTail("3");

        ownLinkedList.addNodeAny(6,"4");

        System.out.println(ownLinkedList.getSize());
    }
}
