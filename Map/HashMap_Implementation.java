package Map;

import java.util.*;

public class HashMap_Implementation<K,V>{
        class Node{
            K key;
            V value;
            Node next;
        }

        private ArrayList<Node> ll;
        private int size=0;
         public  HashMap_Implementation(int n){
             ll=new ArrayList<>();
             for (int i = 0; i <n ; i++) {
                 ll.add(null);
             }
         }
    public  HashMap_Implementation(){
        this(4);
    }
         public int hashfun(K key){
    int bn=key.hashCode() % ll.size(); // hashcode key ke corr. integer min to max value se ek unique no. lakr dega..
             // % krne se range m hi aaega(0ton-1)
             if(bn<0){
                 bn=bn+ll.size();

             }
             return bn;
         }
        public void put(K key, V value){
             int idx=hashfun(key);
             Node temp=ll.get(idx); //linkedlist ka strting point milega
             while(temp!=null){ //value ll m search krenge
                 if(temp.key.equals(key)){ //search for particular key in linkedlist
                     temp.value=value;
                     return;
                 }
                 temp=temp.next;
             }
             //agr element nhi mila to value daal denge
             Node nn= new Node();
             nn.key=key;
             nn.value=value;
             temp=ll.get(idx);
             nn.next=temp;
             ll.set(idx,nn);
             size++;
             double thf=2.0;
             double lf=(1.0*size)/ll.size();
             if(lf>thf){ //rehashing krrenge is condition m
                 rehashing();
             }
        }

    private void rehashing() {
             ArrayList<Node> new_ll=new ArrayList<>();
        for (int i = 0; i < 2*ll.size(); i++) {
            new_ll.add(null);
        }
        ArrayList<Node> oba=ll;
        ll=new_ll;
        for (Node temp:oba) {
            while (temp!=null){
                put(temp.key, temp.value);
                temp= temp.next;
            }
        }
    }

    public V get(K key) {
        int idx=hashfun(key);
        Node temp=ll.get(idx); //linkedlist ka strting point milega
        while(temp!=null){ //value ll m search krenge
            if(temp.key.equals(key)){ //search for particular key in linkedlist

                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }
    public boolean containsKey(K key) {
        int idx=hashfun(key);
        Node temp=ll.get(idx); //linkedlist ka strting point milega
        while(temp!=null){ //value ll m search krenge
            if(temp.key.equals(key)){ //search for particular key in linkedlist

                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public V remove(K key){
        int idx=hashfun(key);
        Node curr=ll.get(idx);
        Node prev =null;
        while(curr!=null){
            if(curr.key.equals(key)){
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            return null;
        }
        else if(prev==null){
            ll.set(idx,curr.next);
            curr.next=null;
            size--;
            return curr.value;
        }
        else{
            prev.next=curr.next;
            curr.next=null;
            size--;
            return curr.value;
        }
    }
    @Override
    public String toString(){
             String s="{";
        for (Node temp:ll) {
            while (temp!=null){
               s=s+temp.key+"=" + temp.value + ",";
                temp= temp.next;
            }
        }
        return s +"}";
    }
}
