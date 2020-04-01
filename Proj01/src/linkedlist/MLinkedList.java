package linkedlist;

public class MLinkedList {

    protected MNode head = new MNode();

    private MNode createLinkedList() {

        return createLinkedList(1, 0);
    }

    public MNode createLinkedList(int size, int... args) {
        MNode node = new MNode(args[0], null);
        MNode p = node;
        for (int i = 0; i < size - 1; i++) {
            p.next = new MNode(args[i + 1], null);
            p = p.next;
        }
        head.next = node;
        return head;
    }

    public MNode getNodeAtIndex(int index) {
        MNode p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p;
    }

    public MNode getNodeAtLastIndex(int index) {
        MNode p = head;
        int length = length();
        if (index > length) {
            return null;
        }
        for (int i = 0; i < length - index + 1; i++) {
            p = p.next;
        }
        return p;
    }

    public int length() {
        MNode p = head;
        int i = 0;
        while (p.next != null) {
            p = p.next;
            i++;
        }
        return i;
    }

    public void printLinkedList() {
        MNode p = head;
        StringBuilder sb = new StringBuilder();
        while (p.next != null) {
            p = p.next;
            if (p.next != null) {
                sb.append(p).append(" -> ");
            } else {
                sb.append(p);
            }
        }
        System.out.println(sb.toString());
    }
}
