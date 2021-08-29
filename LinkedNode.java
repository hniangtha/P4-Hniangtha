public class LinkedNode {
    private int data;
    private LinkedNode next;
    public LinkedNode(int data) {
        this.data=data;
        next=null;
    }

    // constructor that initialize the data and next
    public LinkedNode(int data, LinkedNode next)
    {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
