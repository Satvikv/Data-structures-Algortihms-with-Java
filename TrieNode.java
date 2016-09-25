import java.util.*;
class TrieNode{
 char data;// TO store a character of the string.
 boolean is_leaf;// To mark a word has been completed.
 //TrieNode child[]; We can use array of size 26 for mapping children.
 HashMap<Integer,TrieNode> children;//Hashmap is used for mapping children with key as Alphabets and value as the character of the string.
 
 TrieNode(){
	 
	 children=new HashMap<Integer,TrieNode>(26);
	 data='0';
	 is_leaf=false;
 }

}
