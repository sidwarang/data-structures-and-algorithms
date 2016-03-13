package LinkedList;

/**
 * Created by Siddharth on 5/24/2015.
 */
public class FlattenList {

    void Flatten(ListNodeC head, ListNodeC tail) {
        ListNodeC cur = head;
        while (cur.getNext() != null) {
            if (cur.getChild() != null) {
                append(cur.getChild(), tail);
            }
            cur = cur.getNext();
        }
        if (cur.getNext() == null) {
        }
    }

    private void append(ListNodeC child, ListNodeC tail) {

    }
}
