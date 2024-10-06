package Trie;

import java.util.HashMap;
import java.util.List;

public class Replace_Words {
    class Trie{
        class Node{
            char ch;
            HashMap<Character,Node> child= new HashMap<>();
            boolean isTerminal;
        }
        private Node root= new Node();
        public void insert(String s){
            Node curr=root;
            for (int i = 0; i < s.length(); i++) {
                char ch= s.charAt(i);
                if(curr.child.containsKey(ch)){
                    curr=curr.child.get(ch);
                }
                else{
                    Node nn= new Node();
                    nn.ch=ch;
                    curr.child.put(ch,nn);
                    curr=nn;
                }
            }
            curr.isTerminal=true;
        }
        public  String replace(String s){
            String replaceStr="";
            Node curr= root;
            for (int i = 0; i < s.length(); i++) {
                if(curr.isTerminal) return replaceStr;
                char ch= s.charAt(i);
                if(curr.child.containsKey(ch)){
                    replaceStr+=ch;
                    curr=curr.child.get(ch);
                }
                else {
                    return s;
                }
            }
            return replaceStr;
        }

    }
    public String replaceWords(List<String> dictionary, String sentence) {
     Trie t= new Trie();
     for (String s:dictionary){
         t.insert(s);
     }
     String[] arr= sentence.split(" ");
     String ans="";
        for (int i = 0; i < arr.length; i++) {
            ans=ans+t.replace(arr[i]+" ");
        }
        return ans;
    }
}
