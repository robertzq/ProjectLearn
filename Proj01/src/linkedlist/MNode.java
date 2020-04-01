package linkedlist;
public class MNode {

    private int data;
    protected MNode next;

    public MNode(){
        this(0,null);
    }
    public MNode (int data,MNode next){
        this.data = data;
        this.next=next;
    }

    public String toString(){
        return "["+data+"] ";
    }
}