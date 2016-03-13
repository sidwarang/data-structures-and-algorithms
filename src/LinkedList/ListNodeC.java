package LinkedList;

/**
 * Created by Siddharth on 5/24/2015.
 */
public class ListNodeC {
    private Character data;
    private ListNodeC next;
    private ListNodeC Child;
    public ListNodeC() {
        //this.data = data;
    }

    public Character getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    public ListNodeC getNext() {
        return next;
    }

    public ListNodeC getChild() {
        return Child;
    }

    public void setNext(ListNodeC next) {
        this.next = next;
    }
}
