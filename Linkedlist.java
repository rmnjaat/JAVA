import java.security.PublicKey;

public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int n) {
            this.data = n;
            this.next = null;
        }

    }

    public static Node Head = null;
    public static Node Tail = null;

    public static int Size;

    // methods for linked list
    // not need static because we dont call directly , we take help of ll object
    public void addFirst(int data) {
        Node temp = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = temp;
            return;
        }

        temp.next = Head;

        Head = temp;
    }

    public void addLast(int data) {
        Node temp = new Node(data);
        Size++;

        if (Tail == null) {
            Head = Tail = temp;
            return;
        }

        Node st = Head;
        while (st.next != null) {
            st = st.next;
        }

        st.next = temp;
    }

    public void addMiddle(int data, int pos) {

        Node temp = new Node(data);

        if (pos == 0) {
            addFirst(data);
            return;
        }

        Size++;

        if (Head == null) {
            Head = Tail = temp;
            return;
        }

        Node st = Head;
        for (int i = 0; i < pos - 2; i++) {
            st = st.next;
        }

        temp.next = st.next;

        st.next = temp;
    }

    public void printList(Node Head) {
        Node st = Head;
        while (st != null) {

            System.out.println(st.data);
            st = st.next;
        }
    }

    public void removeFirst() {
        Head = Head.next;
    }

    public void removeLast() {
        
        Node st = Head;
        while (st.next.next != null) {
            st = st.next;
        }

        st.next = null;

    }

    public void removeAny(int data) {

        Node st = Head;
        int i=-1;
        Node prev=null;
        while (st != null) {
            i++;
            if (st.data == data) {
                break;
            }
            prev=st;
            st = st.next;
        }

        if(i==-1){
            System.out.println("empty  list");
            return;
        }

        else if(i==0){
            removeFirst();
            return;

        }
        else if(i==Size-1){
            removeLast();
            return;
        }
        else{
            prev.next=prev.next.next;
            return;
        }

    }


    public Boolean Search(Node hd,int key){
         if(hd==null) return  false;

         if(hd.data==key)
          return true;

         return Search(hd.next,key);
    }

    public void rev(){
        
        Node curr=Head;
        Node prev=null;
        Node nnext=null;


        while (curr!=null){
            nnext= curr.next;

            curr.next=prev;

            prev=curr;

            curr=nnext;
        }

        Head = prev;
    }



    public Node Midfs(Node head){
        Node  sl=head;
        Node  fs=head.next;

        while (fs!=null && fs.next!=null) {
            sl=sl.next;
            fs=fs.next.next;
        }

        return sl;
    }


    public Node mrg(Node lh ,Node rh){
        Node mergedll= new Node(-1);
        Node temp=mergedll;

        while (lh!=null  && rh!=null) {
            if(lh.data<=rh.data){
                temp.next=lh;
                lh=lh.next;

                temp=temp.next;
            }
            else{
                temp.next=rh;
                rh=rh.next;

                temp=temp.next;
            
            }
        }


        while (lh!=null) {
            temp.next=lh;
            lh=lh.next;
            temp=temp.next;
        }
        
        while (rh!=null) {
            temp.next=rh;
            rh=rh.next;
            temp=temp.next;
        }



        return mergedll.next;
    }




    public Node Mergesort(Node head){


        if(head==null || head.next==null )
        {
            return head;
        }

        //find Mid

        Node mid=Midfs(head);

        //left half

        Node lh=head;
        Node rh=mid.next;

        mid.next=null;

        Node nlh= Mergesort(lh);
        Node nrh=Mergesort(rh);


        //merge

        return mrg(nlh,nrh);

    }



    //zigZag
     public Node Mid(Node head){
        Node  sl=head;
        Node  fs=head;

        while (fs!=null && fs.next!=null) {
            sl=sl.next;
            fs=fs.next.next;
        }

        return sl;
    }

     public Node revs(Node head){
        
        Node curr=head;
        Node prev=null;
        Node nnext=null;


        while (curr!=null){
            nnext= curr.next;

            curr.next=prev;

            prev=curr;

            curr=nnext;
        }

        head = prev;

        return head;
    }


    public  Node zigZag(Node head){
        

        Node lh=head;
         
        Node mid = Mid(head);  //3

        // System.out.println(mid.data);

        // System.out.println("-----------------------");
        Node rh=mid.next;
        mid.next=null;

        // printList(rh);
        rh=revs(rh);

        // System.out.println("-----------------------");
        Node ll=new Node(-1);
        Node tem=ll;

        // printList(lh);
        // System.out.println("-----------------------");
        // printList(rh);

        while (rh != null && lh != null) {
            ll.next = lh;
            lh = lh.next;
            ll = ll.next;
    
            if (rh != null) {
                ll.next = rh;
                rh = rh.next;
                ll = ll.next;
            }
        }

        while (lh!=null) {

            ll.next = lh;
            lh = lh.next;
            ll = ll.next;

            
        }



        // ll.next=mid;

        // ll=ll.next;

        ll.next=null;

        return tem.next;
    }


    public static void main(String[] args) {

        Linkedlist lll = new Linkedlist();

        // lll.addFirst(9);
        lll.addFirst(1);
        lll.addLast(2);
        lll.addLast(3);
        lll.addLast(4);
        lll.addLast(5);
        // lll.addMiddle(0, 0);

        lll.printList(Head);

        System.out.println("-----------------------");
        // // ll.removeLast();
        // ll.removeAny(1);
        
        // // System.out.println("----"+Size);
        
        
        // System.out.println(ll.Search(Head, 3));
        
        
        // ll.rev();

    // Node l1= ll.Mergesort(Head);
    Node l1= lll.zigZag(Head);

        
        lll.printList(l1);

    }
}