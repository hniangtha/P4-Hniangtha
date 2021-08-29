public class Set {
    private LinkedNode head;  // start node of the list
    public Set() { // constructor for empty set
        head = null;
    }

    // method that adds x if not already exist
    public void add(int x) {

        if (!exists(x)) {
            LinkedNode node = new LinkedNode(x);
            node.setNext(head);
            head = node;
        }
    }

    // method to delete  x from the set
    public void delete(int x) {

        LinkedNode curr = head;
        LinkedNode prev = null;

        while ((curr != null) && (curr.getData() != x)) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null)
                head = head.getNext();
            else
                prev.setNext(curr.getNext());
        }
    }

    /*
      Method that returns true if the integer x exists in the set and false other wise

     */

    public boolean exists(int x) {

        LinkedNode curr = head;

        while (curr != null) {
            if (curr.getData() == x) {
                return true;
            }
            curr = curr.getNext();

        }
        return false;
    }

    // Method that returns a string representing the set as a space separated list.
    public String toString() {

        StringBuilder str = new StringBuilder();
        LinkedNode curr = head;

        while (curr != null) {
            str.append(curr.getData()).append(" ");
            curr = curr.getNext();
        }
        return str.toString();
    }
}
