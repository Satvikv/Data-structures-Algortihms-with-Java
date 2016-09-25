import java.util.*;
class TrieNode{
 char data;
 boolean is_leaf;
 //TrieNode child[];
 HashMap<Integer,TrieNode> children;
 
 TrieNode(){
	 //child=new TrieNode[26];
	 children=new HashMap<Integer,TrieNode>(26);
	 data='0';
	 is_leaf=false;
 }
 /* TrieNode(char c){
	 data=c;
	 
 } */
}