public class FamilyTree {
    class node{
        int nomerkk;
        node next,prev;
        FamilyTree Data = new FamilyTree(root);

    }
    node head = null,tail=null;
    private int nomerkkin;
    public void add(int nomerkk){
        if(head==null){
            head =  new node();
            tail = head;
            head.nomerkk = nomerkkin;
            head.prev = head;
            head.next = head;
        }else{
            tail.next = new node();
            node temp = tail;
            tail = tail.next;
            tail.prev = temp;
            tail.nomerkk = nomerkkin;
            tail.next = head;
            tail.prev = tail;
        }
    }
    private FamilyMember root;

    public FamilyTree(FamilyMember root){
        this.root = root;
    }
    public FamilyMember getRoot(){
        return this.root;
    }
    
    
}
